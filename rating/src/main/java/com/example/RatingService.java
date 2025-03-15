package com.example;

import jakarta.inject.Singleton;

@Singleton
public class RatingService {

    public int getRating(String title) {
        if (title == null) {
            return -1;
        }
        return (int) ((Math.random() * (10 - 1)) + 1);
    }

}
