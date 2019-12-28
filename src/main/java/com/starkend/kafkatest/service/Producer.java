package com.starkend.kafkatest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    private static final String TEST_TOPIC = "test";
    private static final String USER_TOPIC = "user";
    private static final String FOO_TOPIC = "foo";

    private KafkaTemplate<String, String> kafkaTemplate;

    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        logger.info(String.format("$$ -> Producing message --> %s from Topic --> %s", message, TEST_TOPIC));
        this.kafkaTemplate.send(TEST_TOPIC, message);
    }

    public void sendUserMessage(String message) {
        logger.info(String.format("$$ -> Producing message --> %s from Topic --> %s", message, USER_TOPIC));
        this.kafkaTemplate.send(USER_TOPIC, message);
    }

    public void sendFooMessage(String message) {
        logger.info(String.format("$$ -> Producing message --> %s from Topic --> %s", message, FOO_TOPIC));
        this.kafkaTemplate.send(FOO_TOPIC, message);
    }
}
