package iot.spring.service;

import iot.spring.domain.PrivateAccount;
import iot.spring.repository.PrivateAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class PrivateAccountService {
    @Autowired
    PrivateAccountRepository privateAccountRepository;

    public List<PrivateAccount> findAll() throws Exception {
        List<PrivateAccount> pa = new LinkedList<>(privateAccountRepository.findAll());
        if (pa.isEmpty()) {
            return null;
        }
        return pa;
    }

    public PrivateAccount findById(Integer id) throws Exception {
        if (privateAccountRepository.findById(id).isPresent()) {
            return privateAccountRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(PrivateAccount entity) throws Exception {
        if (entity != null) {
            privateAccountRepository.save(entity);
        }
    }

    @Transactional
    public void update(PrivateAccount pa) throws Exception {
        privateAccountRepository.findById(pa.getId())
                .map(oldEntity -> {
                    oldEntity.setName(pa.getName());
                    oldEntity.setNumber(pa.getNumber());
                    oldEntity.setBalance(pa.getBalance());
                    oldEntity.setName(pa.getName());
                    oldEntity.setCurrencyId(pa.getCurrencyId());
                    oldEntity.setCustomerId(pa.getCustomerId());
                    oldEntity.setTransactionId(pa.getTransactionId());
                    return privateAccountRepository.save(oldEntity);
                })
                .orElseGet(() -> privateAccountRepository.save(pa));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (privateAccountRepository.findById(id).isPresent()) {
            privateAccountRepository.delete(findById(id));
        }
    }
}
