package iot.spring.service;

import iot.spring.domain.Transaction;
import iot.spring.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> findAll() throws Exception {
        List<Transaction> transactions = new LinkedList<>(transactionRepository.findAll());
        if (transactions.isEmpty()) {
            return null;
        }
        return transactions;
    }

    public Transaction findById(Integer id) throws Exception {
        if (transactionRepository.findById(id).isPresent()) {
            return transactionRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Transaction entity) throws Exception {
        if (entity != null) {
            transactionRepository.save(entity);
        }
    }

    @Transactional
    public void update(Transaction transaction) throws Exception {
        transactionRepository.findById(transaction.getId())
                .map(oldEntity -> {
                    oldEntity.setInfo(transaction.getInfo());
                    oldEntity.setAmount(transaction.getAmount());
                    oldEntity.setBusinessId(transaction.getBusinessId());
                    oldEntity.setCustomerId(transaction.getCustomerId());
                    oldEntity.setBankId(transaction.getBankId());
                    oldEntity.setCode(transaction.getCode());
                    return transactionRepository.save(oldEntity);
                })
                .orElseGet(() -> transactionRepository.save(transaction));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (transactionRepository.findById(id).isPresent()) {
            transactionRepository.delete(findById(id));
        }
    }
}
