package com.example.bx_web.controller;

import com.example.bx_web.pojo.Book;
import com.example.bx_web.service.BookService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BookCntroller {
    @Autowired
    public BookService bookService;

    @RequestMapping(value = "/bookinfo")
    public String BookInfo(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Book book = gson.fromJson(jsonStr, Book.class);
        Book book2=bookService.bookinfo(book.getBook_id());
        return JsonUtils.putJson(book2);
    }
    @RequestMapping(value = "/booklist")
    public String BookList() throws JSONException {
        List<Book> book=bookService.booklist();
        System.out.println(JsonUtils.putJson(book));
        return JsonUtils.putJson(book);
    }
}
