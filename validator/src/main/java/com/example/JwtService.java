package com.example;

import jakarta.inject.Singleton;

import java.util.Random;

@Singleton
public class JwtService {

    private final Random random = new Random();
    private final double probabilityOfTokenExpiration = 0.05;
    public Boolean validateToken(String accessToken) {
        if (accessToken == null)
            return false;
        return !(random.nextDouble() < probabilityOfTokenExpiration);
    }
}
