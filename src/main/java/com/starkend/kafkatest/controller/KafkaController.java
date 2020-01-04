package com.starkend.kafkatest.controller;


import com.starkend.kafkatest.service.Producer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

/*    @GetMapping(value = "/test")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message, KafkaTopic.TEST.getName());
    }

    @GetMapping(value = "/user")
    public void sendMessageToKafkaUserTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message, KafkaTopic.USER.getName());
    }

    @GetMapping(value = "/foo")
    public void sendMessageToKafkaFooTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message, KafkaTopic.FOO.getName());
    }*/

    @GetMapping(value = "/gen/{topic}")
    public void sendMessageGen(@PathVariable("topic") String topic,
                               @RequestParam("message") String message) {
        this.producer.sendMessage(message, topic);
    }
}
