package com.brandon.books.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandon.books.domain.Book;
import com.brandon.books.domain.BookEntity;
import com.brandon.books.repositories.BookRepository;
import com.brandon.books.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    @Override
    public Book create (final Book book) {
        final BookEntity bookEntity = bookToBookEntity(book);
        final BookEntity savedBookEntity = bookRepository.save(bookEntity);
        return bookEntityToBook(savedBookEntity);
    }

    private BookEntity bookToBookEntity(Book book) {
        return BookEntity.builder()
            .isbn(book.getIsbn())
            .title(book.getTitle())
            .author(book.getAuthor())
            .build();
    }

    private Book bookEntityToBook(BookEntity bookEntity) {
        return Book.builder()
            .isbn(bookEntity.getIsbn())
            .title(bookEntity.getTitle())
            .author(bookEntity.getAuthor())
            .build();
    }

}