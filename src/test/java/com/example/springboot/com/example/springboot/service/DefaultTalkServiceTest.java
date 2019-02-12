package com.example.springboot.com.example.springboot.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springboot.service.DefaultTalkService;
import com.example.springboot.service.TalkService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DefaultTalkServiceTest {

    @Test
    @DisplayName("Example TalkService should work!")
    void talkSuccessTest() {

        TalkService talkService = new DefaultTalkService();
        assertEquals("Hello", talkService.talk("Hi"));
        assertEquals("Goodbye", talkService.talk("By"));
        assertEquals("Can't find answer", talkService.talk(null));
        assertEquals("Can't find answer", talkService.talk("Some text"));
    }
}
