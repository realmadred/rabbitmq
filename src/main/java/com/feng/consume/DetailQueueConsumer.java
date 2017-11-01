package com.feng.consume;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class DetailQueueConsumer implements MessageListener {
    @Override
    public void onMessage(Message message) {
//        System.out.println("DetailQueueConsumerTest123: " + new String(message.getBody()));
    }
}