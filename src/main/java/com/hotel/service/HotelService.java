package com.hotel.service;

import com.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel createHotel(Hotel hotel);
    //get all
    List<Hotel> getAll();
    //get single
    Hotel getSingleHotel(String id);
}
