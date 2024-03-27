package com.springapps.bookingapp.service;

import com.springapps.bookingapp.entities.Room;
import com.springapps.bookingapp.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    RoomRepository roomRepository;

    ReservationService reservationService;

    @Autowired
    public RoomService(RoomRepository roomRepository, ReservationService reservationService) {
        this.roomRepository = roomRepository;
        this.reservationService = reservationService;
    }


    public boolean isAvailable(Room room, LocalDate checkIn, LocalDate checkOut) {
        return room.getRoomReservations().stream()
                .map(roomReservation -> roomReservation.getReservation())
                .noneMatch(reservation -> reservationService.existReservationBetween(reservation, checkIn, checkOut));
    }

    public List<Room> getAvailableRoomsBy(LocalDate checkIn, LocalDate checkOut, Integer numberOfPersons) {

        List<Room> foundRooms = roomRepository.findAllByGuestNumber(numberOfPersons);
        return foundRooms.stream()
                .filter(room -> isAvailable(room, checkIn, checkOut))
                .collect(Collectors.toList());
    }

    public List<Room> getAvailableRoomsByPrice(LocalDate checkIn, LocalDate checkOut, Integer numberOfPersons) {
        List<Room> availableRooms = getAvailableRoomsBy(checkIn, checkOut, numberOfPersons);
        return availableRooms.stream()
                //.sorted((r1, r2) -> Double.compare(r1.getPricePerNight(), r2.getPricePerNight()))
                .sorted(Comparator.comparingDouble(Room::getPricePerNight))
                .collect(Collectors.toList());
    }
    //Client: vizualizare camere disponibile -de dus in controller
    //Admin - vizualizare venit -de dus in controller
    //Admin - numaru de camere libere dintr-o anumita perioada
}
