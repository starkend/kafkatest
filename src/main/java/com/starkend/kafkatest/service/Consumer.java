package com.starkend.kafkatest.service;

import com.starkend.kafkatest.topic.KafkaTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer extends AbstractConsumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "user", groupId = "group_id")
    public void consumeUserMessage(String message) {
        logger.info(getFormat(message, KafkaTopic.USER));
    }

    @KafkaListener(topics = "foo", groupId = "group_id")
    public void consumeFooMessage(String message) {
        logger.info(getFormat(message, KafkaTopic.FOO));
    }

    @KafkaListener(topics = "default", groupId = "group_id")
    public void consumeDefaultMessage(String message) {
        logger.info(getFormat(message, KafkaTopic.DEFAULT));
    }
}
