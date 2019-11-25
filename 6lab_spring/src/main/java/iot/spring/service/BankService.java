package iot.spring.service;


import iot.spring.domain.Bank;
import iot.spring.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class BankService {
    @Autowired
    BankRepository bankRepository;

    public List<Bank> findAll() throws Exception {
        List<Bank> banks = new LinkedList<>(bankRepository.findAll());
        if (banks.isEmpty()) {
            return null;
        }
        return banks;
    }

    public Bank findById(Integer id) throws Exception {
        if (bankRepository.findById(id).isPresent()) {
            return bankRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Bank entity) throws Exception {
        if (entity != null) {
            bankRepository.save(entity);
        }
    }

    @Transactional
    public void update(Bank bank) throws Exception {
        bankRepository.findById(bank.getId())
                .map(oldEntity -> {
                    oldEntity.setName(bank.getName());
                    oldEntity.setCountryId(bank.getCountryId());
                    return bankRepository.save(oldEntity);
                })
                .orElseGet(() -> bankRepository.save(bank));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (bankRepository.findById(id).isPresent()) {
            bankRepository.delete(findById(id));
        }
    }
}

