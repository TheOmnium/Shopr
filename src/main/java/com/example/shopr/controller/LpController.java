package com.example.shopr.controller;


import com.example.shopr.domain.Game;
import com.example.shopr.domain.GameGenre;
import com.example.shopr.domain.Lp;
import com.example.shopr.domain.LpGenre;
import com.example.shopr.services.GameService;
import com.example.shopr.services.LpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LpController {

    @Autowired
    LpService lpService;


    @GetMapping(value = "/lpPage")
    public String showlpPage(Model model) {
        model.addAttribute("allLps", lpService.getLps());

        return "lpPage";
    }

    @GetMapping(value = "/addLp")
    public String showLpAddPage(Model model){
        model.addAttribute("newLp" , new Lp());
        model.addAttribute("gameGenre" , LpGenre.values());
        return "addLpPage";
    }

    @PostMapping(value = "/addedLp")
    public String add(@ModelAttribute Lp newLp) {
        lpService.addLp(newLp);
        return "redirect:/lpPage";
    }
}


