package com.exam.noxml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.noxml.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
