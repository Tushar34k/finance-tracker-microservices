package com.trasaction.service.entity;

import com.trasaction.service.enums.TransactionType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaction_id;
    private Long userId;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String category;
    private String description;
    private LocalDate date;
}
