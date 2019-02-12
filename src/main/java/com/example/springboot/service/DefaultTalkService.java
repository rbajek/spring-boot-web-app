package com.example.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultTalkService implements TalkService {

    @Override
    public String talk(String request) {
        if(request == null) {
            return  "Can't find answer";
        }
        switch (request) {
            case "Hi" :
                return "Hello";
            case "By" :
                return "Goodbye";
             default: return  "Can't find answer";
        }
    }
}
