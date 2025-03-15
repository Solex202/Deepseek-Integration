package com.lota.ai.deepseek_integration.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeepSeekController {

    @Autowired
    @Qualifier("openAiChatClient")
    private  ChatClient chatClient;

    @GetMapping("/deepseek/{prompt}")
    public String chat(@PathVariable  String prompt){
        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }

}
