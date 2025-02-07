package com.example.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final static Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics = "topicDemo", groupId = "myGroup")
    public void consume(String message) {
        logger.info(String.format("message received -> %s", message));
    }
}
