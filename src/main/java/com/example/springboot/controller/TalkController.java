package com.example.springboot.controller;

import com.example.springboot.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talking")
public class TalkController {

    @Autowired
    private TalkService talkService;

    @GetMapping("/talk")
    public String ask(@RequestParam("word") String word) {
        return talkService.talk(word);
    }
}
