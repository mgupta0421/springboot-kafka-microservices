package net.javaguides.email_service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import net.javaguides.base_domains.dto.OrderEvent;

@Service
public class EmailConsumer {

    private static final Logger LOGGER =LoggerFactory.getLogger(EmailConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event){
        LOGGER.info(String.format("Order received to Email Consumer %s", event.toString()));

        // send email to the customer
    }

    
}
