package com.example.shopr.controller;

import com.example.shopr.domain.User;
import com.example.shopr.services.ArticleService;
import com.example.shopr.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String showArticlePage(Model model) {
        model.addAttribute("allArticles", articleService.findAllArticles());
        model.addAttribute("allUsers", userService.findAllUsers());
        return "index";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute("updatedUser") User updatedUser, BindingResult result, ModelMap model) {
//        model.getAttribute(String.valueOf(updatedUser));
        updatedUser.setLoggedIn(true);
        userService.updateUser(updatedUser);
        return "redirect:/";
    }


}
