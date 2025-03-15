package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

@Controller("/jwt")
public class JwtController {
    private final JwtService jwtService;

    public JwtController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Post("/validate")
    public ValidationResponse validateToken(@Body @Valid JwtRequest request) {
        Boolean isValid = jwtService.validateToken(request.access_token);
        return new ValidationResponse(isValid);
    }

    @Introspected
    @Serdeable.Deserializable
    public record JwtRequest(@NotBlank String access_token) {}

    @Introspected
    @Serdeable
    public record ValidationResponse(@NotBlank Boolean isValid) {}

}