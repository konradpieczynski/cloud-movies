package com.example.moviemicroservice.service;

import com.example.moviemicroservice.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class MovieService {
    public List findAllMovies() {
        return null;
    }

    public Movie findMovieById(Long movieId) {
        return null;
    }

    public Movie createMovie(Movie movie) {
        return movie;
    }

    public void deleteMovie(Long movieId) {
    }

    public Movie updateMovie(Movie movie, Movie movie1) {
        return movie;
    }

    public Movie updateMovie(Map updates, Long movieId) {
        return null;
    }
}
