package com.study.jpapractice.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @Column(length = 15)
    private String userId;

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
    private UserType userType = UserType.ROLE_USER;

    @Column(name = "useyn")
    private String useYn = "y";

}
