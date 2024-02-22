package com.hotel.services;

import com.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel create(Hotel hotel);

    //get All
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}