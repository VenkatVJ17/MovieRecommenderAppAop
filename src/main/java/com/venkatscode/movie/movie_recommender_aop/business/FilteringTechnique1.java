package com.venkatscode.movie.movie_recommender_aop.business;


import com.venkatscode.movie.movie_recommender_aop.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {

    @Autowired
    private Movie movie;

    public String contentBasedFiltering() {
        String movieDetails = movie.getMovieDetails();
        return movieDetails;
    }
}