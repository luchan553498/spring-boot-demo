package com.liqg.demo.dao;

import com.liqg.demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface BookDao {

    public List<Book> getAllBooks();

    public Book getBook(int id);
}
