package com.infinity.commerce.logging_service.service;

import com.infinity.commerce.logging_service.entity.InventoryTransaction;
import com.infinity.commerce.logging_service.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    @Autowired
    TransactionRepository   transactionRepository;
    public InventoryTransaction readLogsById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }
    public void addLogs(InventoryTransaction inventoryTransaction){
        transactionRepository.save(inventoryTransaction);
    }
}
