package com.abhinav.kakfa_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("topic1").build();
    }

    @Bean
    public NewTopic newTopic2(){
        return TopicBuilder.name("topic2").build();
    }
}
