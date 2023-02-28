package com.study.jpapractice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RefreshToken {

    @GeneratedValue
    private Long tokenIndex;
    @Id
    private String userId;
    private String refreshToken;

}
