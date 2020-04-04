package iot.spring.service;

import iot.spring.domain.Service;
import iot.spring.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    ServiceRepository serviceRepository;

    public List<Service> findAll() throws Exception {
        List<Service> products = new LinkedList<>(serviceRepository.findAll());
        if (products.isEmpty()) {
            return null;
        }
        return products;
    }

    public Service findById(Integer id) throws Exception {
        if (serviceRepository.findById(id).isPresent()) {
            return serviceRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Service entity) throws Exception {
        if (entity != null) {
            serviceRepository.save(entity);
        }
    }

    @Transactional
    public void update(Service service) throws Exception {
        serviceRepository.findById(service.getId())
                .map(oldEntity -> {
                    oldEntity.setName(service.getName());
                    oldEntity.setPrice(service.getPrice());
                    oldEntity.setQuantity(service.getQuantity());
                    oldEntity.setBusinessId(service.getBusinessId());
                    return serviceRepository.save(oldEntity);
                })
                .orElseGet(() -> serviceRepository.save(service));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (serviceRepository.findById(id).isPresent()) {
            serviceRepository.delete(findById(id));
        }
    }
}
