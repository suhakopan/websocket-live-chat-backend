package com.suhakopan.websocketexample.controller;

import com.suhakopan.websocketexample.model.Message;
import com.suhakopan.websocketexample.model.OutputMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * WebSocketController
 *
 * @author suhakopan
 * @since 5/31/2021
 */

@Controller
public class WebSocketController {

    Logger logger = LoggerFactory.getLogger(WebSocketController.class);

    @MessageMapping("/chat")
    @SendTo("/topic")
    public OutputMessage send(@Payload Message message) {
        logger.info("Message Received: {}", message.toString());
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        OutputMessage response = new OutputMessage(message.getFrom(), message.getText(), time);
        return response;
    }
}
