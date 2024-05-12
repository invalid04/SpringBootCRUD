package com.brandon.books.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import static com.brandon.books.TestData.testBook;
import static com.brandon.books.TestData.testBookEntity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.brandon.books.domain.Book;
import com.brandon.books.domain.BookEntity;
import com.brandon.books.repositories.BookRepository;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {
    
    @Mock
    private BookRepository bookRepository; 

    @InjectMocks
    private BookServiceImpl underTest;

    @Test
    public void testThatBookIsSaved() {
        final Book book = testBook();

            final BookEntity bookEntity = testBookEntity();

            when(bookRepository.save(eq(bookEntity))).thenReturn(bookEntity);

            final Book result = underTest.create(book);
            assertEquals(book, result);
        
    }

}
