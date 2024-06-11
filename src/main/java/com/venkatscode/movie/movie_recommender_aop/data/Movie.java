package com.venkatscode.movie.movie_recommender_aop.data;


import com.venkatscode.movie.movie_recommender_aop.aspect.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    @MeasureTime

    public String getMovieDetails() {
        return "movie details";
    }
}