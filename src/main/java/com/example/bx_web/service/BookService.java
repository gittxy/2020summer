package com.example.bx_web.service;

import com.example.bx_web.pojo.Book;

import java.util.List;

public interface BookService {
    void add(Book book);
    void delete(Long book_id, Long store_id);
    List<Book> getAllBook(Long store_id);
    int edit(Book book);
}
