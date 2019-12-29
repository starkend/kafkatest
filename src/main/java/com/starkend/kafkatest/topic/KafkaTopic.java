package com.starkend.kafkatest.topic;

public enum KafkaTopic {
    TEST("test"),
    FOO("foo"),
    USER("user");

    private String name;

    KafkaTopic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
