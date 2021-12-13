package com.bc.message.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @RabbitListener(queues = "user-created")
    public void consumer(Message message) {
        System.out.println(new String(message.getBody()));
    }

}
