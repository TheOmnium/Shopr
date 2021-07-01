package com.example.shopr.repositories;

import com.example.shopr.domain.Game;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class GameRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Game> getGames() {
        List<Game> gamesList = entityManager.createQuery("select g from Game g order by g.title , g.publisher, g.price", Game.class).getResultList();
        return gamesList;

    }

    @Transactional
    public void addGame(Game newGame) {
        entityManager.persist(newGame);
    }

    public void updateGame(Game newGame) {
        entityManager.merge(newGame);
    }

    public Game findById(long gameId){
        return entityManager.find(Game.class, gameId);
    }

//    public Game findById(Long gameId) {
//        TypedQuery<Game> query = entityManager.createQuery("select g from Game g where g.id = :id" , Game.class);
//        query.setParameter("id" , gameId);
//        return query.getSingleResult();
//    }
}
