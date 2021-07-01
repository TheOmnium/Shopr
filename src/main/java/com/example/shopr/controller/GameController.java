package com.example.shopr.controller;


import com.example.shopr.domain.Game;
import com.example.shopr.domain.GameGenre;
import com.example.shopr.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {

    @Autowired
    GameService gameService;


    @GetMapping(value = "/gamePage")
    public String showGamePage(Model model) {
        model.addAttribute("allGames", gameService.getGames());
        return "gamePage";
    }

    @GetMapping(value = "/addGame")
    public String showGameAddPage(Model model){
        model.addAttribute("newGame" , new Game());
        model.addAttribute("gameGenre" , GameGenre.values());
        return "addGamePage";
    }

    @PostMapping(value = "/add")
    public String add(@ModelAttribute Game newGame) {
        gameService.addGame(newGame);
        return "redirect:/gamePage";
    }

    @GetMapping(value = "/gameDetails/{gameId}")
    public String showGameDetailPage(@PathVariable("gameId") Long gameId, Model model){
        model.addAttribute("game",gameService.findById(gameId));
        return "detailGamePage";
    }

    @PostMapping(value = "/editedGame/{id}")
    public String editGame(@ModelAttribute Game newGame){
        gameService.updateGame(newGame);
        return "redirect:/";
    }
}


