package com.example.moviemicroservice.domain;

import java.util.Objects;

public class Rating {
    private Long id;
    private Long movieId;
    private Integer stars;

    public Rating() {
    }

    public Rating(Long id, Long movieId, Integer stars) {
        this.id = id;
        this.movieId = movieId;
        this.stars = stars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rating rating = (Rating) o;

        if (!Objects.equals(id, rating.id)) return false;
        if (!Objects.equals(movieId, rating.movieId)) return false;
        return Objects.equals(stars, rating.stars);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
        result = 31 * result + (stars != null ? stars.hashCode() : 0);
        return result;
    }
}
