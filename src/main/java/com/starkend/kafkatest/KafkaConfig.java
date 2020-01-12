package com.starkend.kafkatest;

import com.starkend.kafkatest.topic.KafkaTopic;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootConfiguration
public class KafkaConfig {

//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//        ProducerFactory<String, String> pf = new DefaultKafkaProducerFactory<>(senderProps());
//        AdminClient adminClient = KafkaAdminClient.create(senderProps());
//
//        CreateTopicsResult res = adminClient.createTopics(
//                Stream.of(KafkaTopic.values()).map(
//                        name -> new NewTopic(name.getName(), 1, (short) 1)
//                ).collect(Collectors.toList())
//        );
//
//        return new KafkaTemplate<>(pf);
//    }
//
//    private Map<String, Object> senderProps() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        props.put(ProducerConfig.RETRIES_CONFIG, 0);
//        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
//        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
//        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return props;
//    }
}
