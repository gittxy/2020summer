package com.example.bx_web.service;

import com.example.bx_web.pojo.Book;

import java.math.BigInteger;
import java.util.List;

public interface BookService {
    List<Book> booklist();
    Book bookinfo(Long book_id);
    void add(Book book);
    void delete(Long book_id,Long store_id);
    List<Book> getAllBook(Long store_id);
    int edit(Book book);
}
