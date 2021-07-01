package com.example.shopr.services;


import com.example.shopr.domain.Game;
import com.example.shopr.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<Game> getGames() {
        return gameRepository.getGames();
    }

    public void addGame(Game newGame) {
        gameRepository.addGame(newGame);
    }

    public void updateGame(Game newGame) {
        gameRepository.updateGame(newGame);
    }

    public Game findById(Long id) {
        return gameRepository.findById(id);
    }

}
