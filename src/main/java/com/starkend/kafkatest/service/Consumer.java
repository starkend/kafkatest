package com.starkend.kafkatest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("$$ -> Consumed Message -> %s from Topic --> %s", message, "test"));
    }

    @KafkaListener(topics = "user", groupId = "group_id")
    public void consumeUserMessage(String message) {
        logger.info(String.format("$$ -> Consumed Message -> %s from Topic --> %s", message, "user"));
    }

    @KafkaListener(topics = "foo", groupId = "group_id")
    public void consumeFooMessage(String message) {
        logger.info(String.format("$$ -> Consumed Message -> %s from Topic --> %s", message, "foo"));
    }
}
