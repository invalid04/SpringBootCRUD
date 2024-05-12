package com.brandon.books;

import com.brandon.books.domain.Book;
import com.brandon.books.domain.BookEntity;

public final class TestData {

    private TestData() {

    }

    public static Book testBook() {
        return Book.builder()
            .isbn("02345678")
            .author("Virginia Woolf")
            .title("The Waves")
            .build();
    }

    public static BookEntity testBookEntity() {
        return BookEntity.builder()
            .isbn("02345678")
            .author("Virginia Woolf")
            .title("The Waves")
            .build();        
    }
}
