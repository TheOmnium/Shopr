package com.example.shopr.repositories;


import com.example.shopr.domain.Game;
import com.example.shopr.domain.Lp;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class LpRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Lp> getLps() {
        List<Lp> lpList = entityManager.createQuery("select lp from Lp lp order by lp.title , lp.producer, lp.price", Lp.class).getResultList();
        return lpList;
    }

    @Transactional
    public void addLp(Lp newLp) {
        entityManager.persist(newLp);
    }
}

