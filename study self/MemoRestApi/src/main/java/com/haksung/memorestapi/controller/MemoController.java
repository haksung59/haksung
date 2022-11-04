package com.haksung.memorestapi.controller;

import com.haksung.memorestapi.dto.MemoDto;
import com.haksung.memorestapi.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemoController {

    @Autowired
    public MemoService service;

    @GetMapping("/memo")
    List<MemoDto> getMemo() {
        return service.getMemo();
    }

    @GetMapping("/memo/{id}")
    MemoDto getMemoDetail(@PathVariable("id") int id) { return service.getMemoDetail(id); }

    @PostMapping("/memo")
    String postMemo(@RequestBody MemoDto memo) { return service.postMemo(memo); }

    @PutMapping("/memo")
    String putMemo(@RequestBody MemoDto memo) { return service.putMemo(memo); }

    @DeleteMapping("/memo")
    String deleteMemo(@RequestBody MemoDto memo) { return service.deleteMemo(memo); }

}
