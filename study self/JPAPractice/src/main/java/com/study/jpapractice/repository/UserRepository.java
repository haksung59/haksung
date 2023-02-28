package com.study.jpapractice.repository;

import com.study.jpapractice.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(User user){
        em.persist(user);
    }

    public User find(String id){
        return em.find(User.class, id);
    }

    public User update(String id, User user){
        User findUser = em.find(User.class, id);

        findUser = user;

        return findUser;
    }

}
