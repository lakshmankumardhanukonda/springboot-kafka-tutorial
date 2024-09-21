package com.example.springboot_kafka_tutorial.kafka;

import com.example.springboot_kafka_tutorial.constants.AppConstants;
import com.example.springboot_kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(User data){
        LOGGER.info(String.format("Message received -> %s", data.toString()));
    }
}
