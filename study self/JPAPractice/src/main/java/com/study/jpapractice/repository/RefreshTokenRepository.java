package com.study.jpapractice.repository;

import com.study.jpapractice.entity.RefreshToken;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class RefreshTokenRepository {

    @PersistenceContext
    private EntityManager em;

    public void update(RefreshToken token){
        RefreshToken findToken = em.find(RefreshToken.class, token.getUserId());

        findToken.setRefreshToken(token.getRefreshToken());
    }

}
