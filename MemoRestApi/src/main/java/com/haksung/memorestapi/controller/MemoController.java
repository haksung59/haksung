package com.haksung.memorestapi.controller;

import com.haksung.memorestapi.dto.MemoDto;
import com.haksung.memorestapi.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemoController {

    @Autowired
    public MemoService service;

    @GetMapping("/memo")
    List<MemoDto> getMemo() {
        return service.getMemo();
    }


}
