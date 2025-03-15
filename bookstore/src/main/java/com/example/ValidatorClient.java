package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotBlank;

@Client("validator")
public interface ValidatorClient {
    @Post("/jwt/validate")
    ValidationResponse validateToken(@Body StoreService.JWTRequest jwtRequest);

    @Introspected
    @Serdeable
    public record ValidationResponse(@NotBlank Boolean isValid) {}


}