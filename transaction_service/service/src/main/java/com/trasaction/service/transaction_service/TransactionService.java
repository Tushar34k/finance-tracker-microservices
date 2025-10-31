package com.trasaction.service.transaction_service;

import com.trasaction.service.repository.TransactionRepository;

public class TransactionService {

    public TransactionRepository transactionRepository;

    public  TransactionService(TransactionRepository repo)
    {
        this.transactionRepository= repo;
    }



}
