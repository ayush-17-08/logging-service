package com.infinity.commerce.logging_service.repository;

import com.infinity.commerce.logging_service.entity.InventoryTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<InventoryTransaction,Long> {
}
