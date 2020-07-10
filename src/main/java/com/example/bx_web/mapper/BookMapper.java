package com.example.bx_web.mapper;

import com.example.bx_web.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> booklist();
    Book bookinfo(Long book_id);
    void add(Book book);
    void delete(Long book_id,Long store_id);
    List<Book> getAllBook(Long store_id);
    int edit(Book book);
}
