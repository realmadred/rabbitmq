package com.feng.consume;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * 消息监听
 */
public class QueueListener implements MessageListener {

    @Override
    public void onMessage(Message msg) {
//        try{
//            final byte[] body = msg.getBody();
//            System.out.println(new String(body));
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }

}