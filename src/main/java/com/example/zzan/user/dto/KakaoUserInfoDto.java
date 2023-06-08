package com.example.zzan.user.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class KakaoUserInfoDto {
    private final Long id;
    private final String username;
    private final String email;
    private final String kakaoUserImage;
    private final String gender;
    private final String ageRange;
    private final Date birthday;

    public KakaoUserInfoDto(Long id, String username, String email, String kakaoUserImage, String gender, String ageRange, Date birthday) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.kakaoUserImage = kakaoUserImage;
        this.gender = gender;
        this.ageRange = ageRange;
        this.birthday = birthday;
    }
}
