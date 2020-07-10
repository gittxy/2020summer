package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.BookMapper;
import com.example.bx_web.pojo.Book;
import com.example.bx_web.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public Book bookinfo(Long book_id) {
        return this.bookMapper.bookinfo(book_id);
    }

    @Override
    public void add(Book book) {
        bookMapper.add(book);
    }

    @Override
    public void delete(Long book_id,Long store_id) {
        bookMapper.delete(book_id,store_id);
    }

    @Override
    public List<Book> getAllBook(Long store_id) {
        return bookMapper.getAllBook(store_id);
    }

    @Override
    public int edit(Book book) {
        return bookMapper.edit(book);
    }
}
