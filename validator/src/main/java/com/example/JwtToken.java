package com.example;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotBlank;

@Serdeable
public class JwtToken {
    @NotBlank
    private String accessToken;
}
