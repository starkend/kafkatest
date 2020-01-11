package com.starkend.kafkatest.service;

import com.starkend.kafkatest.topic.KafkaTopic;

public class AbstractConsumer {
    protected String getFormat(String message, KafkaTopic user) {
        return String.format("$$ -> Consumed Message -> %s from Topic --> %s", message, user.getName());
    }
}
