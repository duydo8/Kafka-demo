package com.example.demo.kafka;

import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static  final Logger logger= LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "topicDemo_Json")
    public void consume(User user){
        logger.info(String.format("Json message receive -> %s",user.toString()));
    }

}
