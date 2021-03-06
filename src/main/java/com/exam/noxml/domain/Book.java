package com.exam.noxml.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String isbn;
    String title;
    String content;
    
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getIsbn() {
      return isbn;
    }
    public void setIsbn(String isbn) {
      this.isbn = isbn;
    }
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getContent() {
      return content;
    }
    public void setContent(String content) {
      this.content = content;
    }
}
