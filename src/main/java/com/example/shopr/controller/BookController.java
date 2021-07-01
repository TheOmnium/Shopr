package com.example.shopr.controller;



import com.example.shopr.domain.*;
import com.example.shopr.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    BookService bookService;


    @GetMapping(value = "/bookpage")
    public String showBookPage(Model model) {
        model.addAttribute("allBooks", bookService.getBooks());

        return "bookPage";
    }

    @GetMapping(value = "/addBookFiction")
    public String showBookFictionAddPage(Model model){
        model.addAttribute("newBookFiction", new BookFiction() {});
        model.addAttribute("bookGenre" , BookGenre.values());
        return "addBookFictionPage";
    }

    @PostMapping(value = "/addedBookFiction")
    public String add(@ModelAttribute BookFiction newBookFiction) {
        bookService.addBookFiction(newBookFiction);
        return "redirect:/";
    }

    @GetMapping(value = "/addBookNonFiction")
    public String showBookNonFictionAddPage(Model model){
        model.addAttribute("newBookNonFiction", new BookNonFiction() {});
        model.addAttribute("bookSubject" , BookSubject.values());
        return "addBookNonFictionPage";
    }

    @PostMapping(value = "/addedBookNonFiction")
    public String add(@ModelAttribute BookNonFiction newBookNonFiction) {
        bookService.addBookNonFiction(newBookNonFiction);
        return "redirect:/";
    }
}


