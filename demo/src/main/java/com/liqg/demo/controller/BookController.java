package com.liqg.demo.controller;

import com.liqg.demo.domain.Book;
import com.liqg.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private IBookService bookServiceImpl;

    @RequestMapping("/list/all")
    public List<Book> listAllBooks() {
        return bookServiceImpl.getAllBooks();
    }

    @RequestMapping("/layout")
    public ModelAndView getBookPartialPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("books/layout");
        return modelAndView;
    }

}
