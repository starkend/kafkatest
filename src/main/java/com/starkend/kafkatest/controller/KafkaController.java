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

    @GetMapping(value = "{topic}")
    public void sendMessageGen(@PathVariable("topic") String topic,
                               @RequestParam("message") String message) {
        this.producer.sendMessage(message, topic);
    }
}
