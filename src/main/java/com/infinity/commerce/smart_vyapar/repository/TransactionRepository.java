package com.infinity.commerce.smart_vyapar.repository;

import com.infinity.commerce.smart_vyapar.entity.InventoryTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<InventoryTransaction,Long> {
}
