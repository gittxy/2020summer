package com.example.bx_web.controller;

import com.example.bx_web.pojo.Book;
import com.example.bx_web.pojo.Store;
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
