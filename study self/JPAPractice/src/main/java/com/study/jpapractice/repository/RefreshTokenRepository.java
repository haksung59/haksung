package com.study.jpapractice.repository;

import com.study.jpapractice.entity.RefreshToken;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RefreshTokenRepository {

    @PersistenceContext
    private EntityManager em;

    public void update(RefreshToken token){
        RefreshToken findToken = em.find(RefreshToken.class, token.getUserId());

        findToken.setRefreshToken(token.getRefreshToken());
    }

}
