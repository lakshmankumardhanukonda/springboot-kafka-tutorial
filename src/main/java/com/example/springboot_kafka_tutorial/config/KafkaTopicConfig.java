package com.example.springboot_kafka_tutorial.config;

import com.example.springboot_kafka_tutorial.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic sampleTopic(){
        return TopicBuilder.name(AppConstants.TOPIC_NAME)
                .build();
    }
}
