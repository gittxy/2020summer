package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.BookMapper;
import com.example.bx_web.pojo.Book;
import com.example.bx_web.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<Book> booklist() {
        return this.bookMapper.booklist();
    }

    @Override
    public Book bookinfo(BigInteger book_id) {
        return this.bookMapper.bookinfo(book_id);
    }
}
