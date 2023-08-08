package com.example.moviemicroservice.service;

import com.example.moviemicroservice.domain.Rating;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RatingService {
    public List findAllRatings() {
        return null;
    }

    public List findRatingsByMovieId(Long movieId) {
        return null;
    }

    public Rating createRating(Rating rating) {
        return rating;
    }

    public void deleteRating(Long ratingId) {
    }

    public Rating updateRating(Rating rating, Long ratingId) {
        return rating;
    }

    public Rating updateRating(Map updates, Long ratingId) {
        return null;
    }
}
