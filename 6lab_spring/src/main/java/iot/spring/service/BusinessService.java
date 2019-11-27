package iot.spring.service;

import iot.spring.domain.Business;
import iot.spring.repository.BusinessRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BusinessService {
    @Autowired
    BusinessRepository businessRepository;

    public List<Business> findAll() throws Exception {
        List<Business> businesses = new LinkedList<>(businessRepository.findAll());
        if (businesses.isEmpty()) {
            return null;
        }
        return businesses;
    }

    public Business findById(Integer id) throws Exception {
        if (businessRepository.findById(id).isPresent()) {
            return businessRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Business entity) throws Exception {
        if (entity != null) {
            businessRepository.save(entity);
        }
    }

    @Transactional
    public void update(Business business) throws Exception {
        businessRepository.findById(business.getId())
                .map(oldEntity -> {
                    oldEntity.setName(business.getName());
                    oldEntity.setService(business.getService());
                    oldEntity.setEmail(business.getEmail());
                    return businessRepository.save(oldEntity);
                })
                .orElseGet(() -> businessRepository.save(business));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (businessRepository.findById(id).isPresent()) {
            businessRepository.delete(findById(id));
        }
    }
}
