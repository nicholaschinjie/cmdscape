package com.personal.cmdscape.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	
	// Register a websocket endpoint that clients can use to connect 
	// to my websocket server
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS(); // enable fallback opt for browsers not supporting ws
    }

    // 
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        
        // 1) Using a simple message broker
        registry.enableSimpleBroker("/topic");
        
        // 2) Using RabbitMQ message broker
//        registry.enableStompBrokerRelay("/topic")
//        .setRelayHost("localhost")
//        .setRelayPort(61613)
//        .setClientLogin("guest")
//        .setClientPasscode("guest");
    }
}