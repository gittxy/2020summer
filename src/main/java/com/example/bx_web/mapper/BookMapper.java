package com.example.bx_web.mapper;

import com.example.bx_web.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> booklist();
    Book bookinfo(BigInteger book_id);
}
