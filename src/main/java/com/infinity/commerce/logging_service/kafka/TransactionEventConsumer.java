package com.infinity.commerce.logging_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionEventConsumer {

    @KafkaListener(topics = "product-event",groupId = "transaction-consumer-group")
    public void consume(TransactionEvent transactionEvent){
        System.out.println("Received Event"+transactionEvent);
        //to_string is invoked when object in passed in sout.
    }
}
