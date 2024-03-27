package com.springapps.bookingapp.controller;

import com.springapps.bookingapp.dto.RoomRequestDTO;
import com.springapps.bookingapp.entities.Hotel;
import com.springapps.bookingapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/{name}")
    public ResponseEntity<Hotel> addHotel(@PathVariable String name ){
        return ResponseEntity.ok(hotelService.createHotel(name));
    }

    @PostMapping("/{hotelId}")
    public ResponseEntity<?> addRoomToHotel(@RequestBody RoomRequestDTO roomRequestDTO, @PathVariable Long hotelId){
        return ResponseEntity.ok(hotelService.addRoomToHotel(roomRequestDTO,hotelId));
    }
    //delete room
    //getAllRooms
    //editRoomPrice
}
