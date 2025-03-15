package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotBlank;

import java.util.Map;

@Client("rating")
public interface RatingClient {
    @Get("/rating{?params*}")
    RatingResponse getRating(@QueryValue Map<String, Object> params);

    @Introspected
    @Serdeable
    public record RatingResponse(@NotBlank Integer rating) {}

}
