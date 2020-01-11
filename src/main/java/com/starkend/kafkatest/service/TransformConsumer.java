package com.starkend.kafkatest.service;

import com.starkend.kafkatest.topic.KafkaTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransformConsumer extends AbstractConsumer {

    private final Logger logger = LoggerFactory.getLogger(TransformConsumer.class);

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consumeTestMessage(String message) {
//        logger.info(String.format("$$ -> TransformConsumer Original Message -> %s from Topic --> %s", message, KafkaTopic.TEST.getName()));
        logger.info(getFormat(message, KafkaTopic.TEST));
        String transformMessage = message.toUpperCase();
        logger.info(getFormat(transformMessage, KafkaTopic.TEST));
    }
}
