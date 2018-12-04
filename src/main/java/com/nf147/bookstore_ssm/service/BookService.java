package com.nf147.bookstore_ssm.service;

import com.nf147.bookstore_ssm.entity.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookService {
    List<Book> listAll();

    Book getBookById(int id);

    List<Book> getBooksByName(String name);

    boolean update(Book book);

    boolean delete(int id);

    Book add(Book book);
}
