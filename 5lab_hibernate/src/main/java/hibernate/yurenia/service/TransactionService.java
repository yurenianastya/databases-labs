package hibernate.yurenia.service;

import hibernate.yurenia.dao.TransactionDAO;
import hibernate.yurenia.model.Transaction;

import java.util.List;

public class TransactionService {

    private TransactionDAO transactionDAO = new TransactionDAO();

    public TransactionService() {
    }

    public Transaction findTransaction(int id) {
        return transactionDAO.findByID(id);
    }

    public void saveTransaction(Transaction transaction) {
        transactionDAO.save(transaction);
    }

    public void deleteTransaction(Transaction transaction) {
        transactionDAO.delete(transaction);
    }

    public void updateTransaction(Transaction transaction) {
        transactionDAO.update(transaction);
    }

    public List<Transaction> findAllTransactions() {
        return transactionDAO.findAll();
    }
}
