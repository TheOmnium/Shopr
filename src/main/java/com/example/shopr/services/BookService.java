package com.example.shopr.services;

import com.example.shopr.domain.Book;
import com.example.shopr.domain.BookFiction;
import com.example.shopr.domain.BookNonFiction;
import com.example.shopr.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public void addBookFiction(BookFiction newBookFiction) {
        bookRepository.addBookFiction(newBookFiction);
    }

    public void addBookNonFiction(BookNonFiction newBookNonFiction) {
        bookRepository.addBookNonFiction(newBookNonFiction);
    }
}
