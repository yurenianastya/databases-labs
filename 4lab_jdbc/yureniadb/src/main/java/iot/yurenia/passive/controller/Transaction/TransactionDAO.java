package iot.yurenia.passive.controller.Transaction;

import iot.yurenia.passive.model.Transaction;

import java.util.Set;

public interface TransactionDAO {
    Transaction getTransaction(int id);
    Set<Transaction> getAllTransactions();
    boolean insertTransactions(Transaction transaction);
    boolean updateTransactions(Transaction transaction);
    boolean deleteTransactions(int id);
}