package com.study.jpapractice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class RefreshToken {

    @GeneratedValue
    private Long tokenIndex;
    @Id
    private String userId;
    private String refreshToken;

}
