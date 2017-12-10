package com.liqg.demo.service.impl;

import com.liqg.demo.dao.BookDao;
import com.liqg.demo.domain.Book;
import com.liqg.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Book getBook(int id) {
        return bookDao.getBook(id);
    }
}
