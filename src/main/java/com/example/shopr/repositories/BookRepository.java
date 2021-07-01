package com.example.shopr.repositories;


import com.example.shopr.domain.Book;
import com.example.shopr.domain.BookFiction;
import com.example.shopr.domain.BookNonFiction;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BookRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Book> getBooks() {
        List<Book> bookList = entityManager.createQuery("select b from Book b order by b.title , b.Author, b.price", Book.class).getResultList();
        return bookList;


    }

    @Transactional
    public void addBookFiction(BookFiction newBookFiction) {
        entityManager.persist(newBookFiction);
    }

    @Transactional
    public void addBookNonFiction(BookNonFiction newBookNonFiction) {
        entityManager.persist(newBookNonFiction);
    }
}
