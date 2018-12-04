package com.nf147.bookstore_ssm.service;

import com.nf147.bookstore_ssm.dao.BookDAO;
import com.nf147.bookstore_ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> listAll() {
        return bookDAO.listAll();
    }

    @Override
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public List<Book> getBooksByName(String name) {
        return bookDAO.getBooksByName(name);
    }

    @Override
    public boolean update(Book book) {
        return bookDAO.update(book);
    }

    @Override
    public boolean delete(int id) {
        return bookDAO.delete(id);
    }

    @Override
    public Book add(Book book) {
        return bookDAO.add(book);
    }
}
