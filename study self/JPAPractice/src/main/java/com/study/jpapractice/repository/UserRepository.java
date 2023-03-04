package com.study.jpapractice.repository;

import com.study.jpapractice.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
