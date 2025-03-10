package com.infinity.commerce.smart_vyapar.service;

import com.infinity.commerce.smart_vyapar.entity.InventoryTransaction;
import com.infinity.commerce.smart_vyapar.repository.TransactionRepository;
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
