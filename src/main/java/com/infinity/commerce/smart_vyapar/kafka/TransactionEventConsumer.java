package com.infinity.commerce.smart_vyapar.kafka;

import com.infinity.commerce.smart_vyapar.entity.InventoryTransaction;
import com.infinity.commerce.smart_vyapar.repository.TransactionRepository;
import com.infinity.commerce.smart_vyapar.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
//why?
public class TransactionEventConsumer {

    @Autowired
    LoggingService loggingService;

    @KafkaListener(topics = "product-event",groupId = "transaction-consumer-group")
    public void consume(TransactionEvent transactionEvent){

        System.out.println("Received Event"+transactionEvent);

        InventoryTransaction inventoryTransaction=InventoryTransaction.builder().
                productId(transactionEvent.getProductId()).
                transactionType(transactionEvent.getTransactionType()).
                transactionStatus(transactionEvent.getTransactionStatus()).
                transactionQty(transactionEvent.getTransactionQty()).
                build();
        //basic conversion should be done here only , service layer should deal with only buisness related logics
        loggingService.addLogs(inventoryTransaction);
        //to_string is invoked when object in passed in sout.
    }
}
