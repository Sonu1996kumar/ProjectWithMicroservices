package com.rating.service;

import com.rating.entity.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();


    //get all by userId
    List<Rating> getRatingByUserId(String userId);


    //get all by hotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
