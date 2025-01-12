package com.brandon.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brandon.books.domain.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {    
}
