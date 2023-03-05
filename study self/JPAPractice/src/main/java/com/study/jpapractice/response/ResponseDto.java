package com.study.jpapractice.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDto {

    private String code;

    private String message;

    public ResponseDto(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
