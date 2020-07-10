package com.example.bx_web.service;

import com.example.bx_web.pojo.Book;

import java.math.BigInteger;
import java.util.List;

public interface BookService {
    List<Book> booklist();
    Book bookinfo(BigInteger book_id);
}
