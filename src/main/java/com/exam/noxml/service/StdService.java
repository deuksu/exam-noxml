package com.exam.noxml.service;

import java.util.List;

import com.exam.noxml.domain.Book;

public interface StdService {
  
  public List<Book> findAll() throws Exception;
}
