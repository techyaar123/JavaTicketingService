package com.abhinav.kakfa_demo.kafka;

import com.abhinav.kakfa_demo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consume(String message){
    LOGGER.info(String.format("Message  received ->  %s ",message));
    }


}
