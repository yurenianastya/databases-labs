package iot.spring.service;

import iot.spring.domain.BusinessAccount;
import iot.spring.repository.BusinessAccountRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BusinessAccountService {
    @Autowired
    BusinessAccountRepository businessAccountRepository;

    public List<BusinessAccount> findAll() throws Exception {
        List<BusinessAccount> ba = new LinkedList<>(businessAccountRepository.findAll());
        if (ba.isEmpty()) {
            return null;
        }
        return ba;
    }

    public BusinessAccount findById(Integer id) throws Exception {
        if (businessAccountRepository.findById(id).isPresent()) {
            return businessAccountRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(BusinessAccount entity) throws Exception {
        if (entity != null) {
            businessAccountRepository.save(entity);
        }
    }

    @Transactional
    public void update(BusinessAccount business) throws Exception {
        businessAccountRepository.findById(business.getId())
                .map(oldEntity -> {
                    oldEntity.setOwner(business.getOwner());
                    oldEntity.setBalance(business.getBalance());
                    oldEntity.setBusinessId(business.getBusinessId());
                    oldEntity.setCurrencyId(business.getCurrencyId());
                    oldEntity.setTransactionId(business.getTransactionId());
                    return businessAccountRepository.save(oldEntity);
                })
                .orElseGet(() -> businessAccountRepository.save(business));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (businessAccountRepository.findById(id).isPresent()) {
            businessAccountRepository.delete(findById(id));
        }
    }
}
