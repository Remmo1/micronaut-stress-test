package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.inject.Singleton;
import jakarta.validation.constraints.NotBlank;

import java.util.Map;

@Singleton
public class StoreService {
    private final BookRepository bookRepository;
    private final ValidatorClient validatorClient;
    private final RatingClient ratingClient;

    public StoreService(BookRepository bookRepository, ValidatorClient validatorClient, RatingClient ratingClient) {
        this.bookRepository = bookRepository;
        this.validatorClient = validatorClient;
        this.ratingClient = ratingClient;
    }

    public Book addBook(String authorization, String author, String title) {

        // check token
        if (!validatorClient.validateToken(new JWTRequest(authorization)).isValid()) {
            return null;
        }

        // get rating
        Integer rating = ratingClient.getRating(Map.of("title", title)).rating();

        return bookRepository.save(new Book(author, title, rating));
    }

    @Introspected
    @Serdeable
    public record JWTRequest(@NotBlank String access_token) {}
}
