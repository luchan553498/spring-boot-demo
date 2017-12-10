package com.liqg.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private  int id;
    private String title;
    private String description;
    private String pubTime;
    private String author;
}
