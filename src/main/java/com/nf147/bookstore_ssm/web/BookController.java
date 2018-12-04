package com.nf147.bookstore_ssm.web;

import com.nf147.bookstore_ssm.entity.Book;
import com.nf147.bookstore_ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book/list")
    public String listAll(Model model) {
        List<Book> books = bookService.listAll();
        model.addAttribute("books", books);
        return "book_list";
    }

    @RequestMapping("/book/detail")
    public String getBookById(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Book bookById = bookService.getBookById(id);
        model.addAttribute("book",bookById);
        return "book_detail";
    }

    @RequestMapping("/book/insert")
    public String add(Model model,HttpServletRequest request){
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        String author = request.getParameter("author");
        String press = request.getParameter("press");
        Book add = bookService.add(new Book(name, price, author, press));
        return "redirect:list";
    }
}
