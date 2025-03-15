package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.Post;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

@Controller("/store")
@ExecuteOn(TaskExecutors.BLOCKING)
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @Post("/book")
    public HttpResponse<Book> addBook(@Header("Authorization") String authorization, @Body @Valid BookRequest request) {
        Book book = storeService.addBook(authorization, request.author, request.title());
        return book == null ? HttpResponse.unauthorized() : HttpResponse.created(book);
    }

    @Introspected
    @Serdeable.Deserializable
    public record BookRequest(@NotBlank String author, @NotBlank String title) {}
}
