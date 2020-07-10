package com.example.bx_web.controller;

import com.example.bx_web.pojo.Book;
import com.example.bx_web.pojo.Store;
import com.example.bx_web.service.BookService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class BookController {
    @Autowired
    public BookService bookService;

    @RequestMapping(value = "/addBook")
    public void AddBook(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Book book = gson.fromJson(jsonStr, Book.class);
        bookService.add(book);
    }

    @RequestMapping(value = "/deleteBook")
    public void DeleteBook(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Book book = gson.fromJson(jsonStr, Book.class);
        bookService.delete(book.getBook_id(),book.getStore_id());
    }

    @RequestMapping(value = "/editBook")
    public void EditBook(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Book book = gson.fromJson(jsonStr, Book.class);
        bookService.edit(book);
    }

    @RequestMapping(value = "/getTotalBook")
    public String GetTotalBook(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Store store = gson.fromJson(jsonStr, Store.class);
        List<Book> list = bookService.getAllBook(store.getStore_id());

        return JsonUtils.putJson(list);
    }
}
