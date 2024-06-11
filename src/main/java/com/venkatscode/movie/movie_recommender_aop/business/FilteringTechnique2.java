package com.venkatscode.movie.movie_recommender_aop.business;

import com.venkatscode.movie.movie_recommender_aop.aspect.MeasureTime;
import com.venkatscode.movie.movie_recommender_aop.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique2 {

    @Autowired
    private User user;
    @MeasureTime

    public String collaborativeFiltering() {
        String userDetails =  user.getUserDetails();
        return userDetails;
    }
}