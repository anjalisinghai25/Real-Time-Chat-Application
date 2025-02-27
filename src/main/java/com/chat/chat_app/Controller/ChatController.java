package com.chat.chat_app.Controller;

import com.chat.chat_app.Entity.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // when any message recivied on this endpoint /app/sendMessage,
    // it will broadcasted to other clients connected to this paticular topic(/topic/message).

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    @GetMapping("/chat")
    public String getChat() {
        return "chat";
    }
}
