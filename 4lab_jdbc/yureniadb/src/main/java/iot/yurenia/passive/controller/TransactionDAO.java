package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Transaction;

import java.util.Set;

public interface TransactionDAO {
    Transaction getTransaction();
    Set<Transaction> getAllTransactions();
    boolean insertTransactions();
    boolean updateTransactions();
    boolean deleteTransactions();
}