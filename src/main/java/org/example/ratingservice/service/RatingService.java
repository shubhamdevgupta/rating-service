package org.example.ratingservice.service;

import org.example.ratingservice.entities.Rating;
import org.example.ratingservice.repository.RatingRepo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {
    Rating createRating(Rating rating);

    List<Rating> getAllRatings();

     List<Rating> getRatingsByUserId(String userId);

     List<Rating> getRatingsByHotelId(String hotelId);

}
