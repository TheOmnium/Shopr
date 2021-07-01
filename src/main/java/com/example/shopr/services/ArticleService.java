package com.example.shopr.services;

import com.example.shopr.domain.Article;
import com.example.shopr.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    public List<Article> findAllArticles() {
        return articleRepository.findAllArticles();
    }


}
