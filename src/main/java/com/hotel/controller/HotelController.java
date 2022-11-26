package com.hotel.controller;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService service;


    //create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createHotel(hotel));
    }

    //get single
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getSingleHotel(id));
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel() {
        return ResponseEntity.ok(service.getAll());
    }
}
