package com.library.manage.dto;


public record LibraryEvent(
        Integer LibraryEventId,
        LibraryEventType libraryEventType,
        Book book

) {
}
