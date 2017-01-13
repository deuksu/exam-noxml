package com.exam.noxml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.noxml.domain.Book;
import com.exam.noxml.repository.BookRepository;
import com.exam.noxml.service.StdService;

@Service(value="com.exam.noxml.service.impl.StdServiceImpl")
public class StdServiceImpl implements StdService {

  @Autowired BookRepository bookRepository;
  
  @Override
  public List<Book> findAll() throws Exception {
    return bookRepository.findAll();
  }

  
}
