package com.example.zzan.webChat.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;



@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatUser {
    @Id
    @GeneratedValue
    private Long id;

    private String nickName;

    private String email;

    private String passwd; // 유저 패스워드

    private String provider;
}
