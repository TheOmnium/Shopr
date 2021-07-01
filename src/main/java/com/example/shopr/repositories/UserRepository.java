package com.example.shopr.repositories;

import com.example.shopr.domain.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAllUsers() {
        List<User> userList = new ArrayList<>();
        userList.addAll(entityManager.createQuery("select u from User u", User.class).getResultList());
        return userList;
    }

    @Transactional
    public void updateUser(User updatedUser) {
        entityManager.merge(updatedUser);
    }
}
