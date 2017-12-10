package com.liqg.demo.service;

import com.liqg.demo.domain.Book;

import java.util.List;

public interface IBookService {
    public List<Book> getAllBooks();
    public Book getBook(int id);
}
