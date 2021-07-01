package com.example.shopr.services;


import com.example.shopr.domain.Game;
import com.example.shopr.domain.Lp;
import com.example.shopr.repositories.LpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LpService {

    @Autowired
    LpRepository lpRepository;

    public List<Lp> getLps() {
        return lpRepository.getLps();
    }

    public void addLp(Lp newLp) {
        lpRepository.addLp(newLp);
    }
}
