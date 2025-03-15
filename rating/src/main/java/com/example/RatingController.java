package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotBlank;

import java.util.Map;

@Controller("/rating")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @Get
    public HttpResponse<Rating> getRating(@QueryValue String title) {
        int rating = ratingService.getRating(title);
        return HttpResponse.ok(new Rating(rating));
    }

    @Introspected
    @Serdeable
    public record Rating(@NotBlank Integer rating) {}

}