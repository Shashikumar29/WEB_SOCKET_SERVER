package com.webSocket1.demo.config;


import com.webSocket1.demo.handler.tutorialHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class webSocket implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(TutorialHandler(), "/tutorial")
                .setAllowedOrigins("*");

    }

    @Bean
    WebSocketHandler TutorialHandler() {
        return new tutorialHandler();
    }
}
