package com.study.jpapractice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(length = 15)
    private String userId;

    @Column(length = 20)
    private String password;

    @Column(length = 20)
    private String nickName;

    @Column(length = 20)
    private String name;

    @Column(length = 8)
    private String birth;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(name = "useyn")
    private String useYn;

}
