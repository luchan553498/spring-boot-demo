package com.liqg.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liqg.demo.domain.Book;
@Mapper
public interface BookDao {

    public List<Book> getAllBooks();

    public Book getBook(int id);
}
