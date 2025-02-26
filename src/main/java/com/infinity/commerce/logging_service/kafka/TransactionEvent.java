package com.infinity.commerce.logging_service.kafka;


import com.infinity.commerce.logging_service.enums.TransactionStatus;
import com.infinity.commerce.logging_service.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionEvent {

    private Long productId;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;
    private Integer transactionQty;

}
