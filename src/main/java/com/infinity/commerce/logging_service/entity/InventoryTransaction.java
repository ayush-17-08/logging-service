package com.infinity.commerce.logging_service.entity;

import com.infinity.commerce.logging_service.enums.TransactionStatus;
import com.infinity.commerce.logging_service.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class InventoryTransaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    private Integer transactionQty;
}
