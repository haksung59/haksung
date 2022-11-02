package com.haksung.memorestapi.dto;

import lombok.Data;

@Data
public class MemoDto {

    private int id;

    private String title;

    private String content;

    private String insertDate;

}
