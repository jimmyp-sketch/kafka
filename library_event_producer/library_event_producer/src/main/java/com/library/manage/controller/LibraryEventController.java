package com.library.manage.controller;

import com.library.manage.dto.LibraryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryEventController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryEventController.class);

    @PostMapping("/v1/libraryEvent")
    public ResponseEntity<LibraryEvent> pushLibraryEvent(@RequestBody LibraryEvent libraryEvent) {
        LOGGER.info("The Library EVent has triggered from controller {}", libraryEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);

    }
}
