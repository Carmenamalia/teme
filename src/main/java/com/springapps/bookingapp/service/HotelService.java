package com.springapps.bookingapp.service;

import com.springapps.bookingapp.dto.RoomRequestDTO;
import com.springapps.bookingapp.entities.Hotel;
import com.springapps.bookingapp.entities.Room;
import com.springapps.bookingapp.exceptions.ResourceNotFoundException;
import com.springapps.bookingapp.repositories.HotelRepository;
import com.springapps.bookingapp.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Transactional
    public Hotel createHotel(String hotelName){
        Hotel hotel = new Hotel(hotelName);
        return hotelRepository.save(hotel);
    }


    @Transactional
    public Room addRoomToHotel(RoomRequestDTO roomRequestDTO, Long hotelId){
        Hotel hotel = hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("hotel does not exist!"));
        Room room = new Room(
                roomRequestDTO.getRoomNumber(),
                roomRequestDTO.getPricePerNight(),
                roomRequestDTO.getGuestNumber(),
                hotel
        );
        return roomRepository.save(room);
    }

    //deleteRooms
    //getAllRooms
    //editRoomPrice
}
