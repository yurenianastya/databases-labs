package iot.spring.service;


import iot.spring.domain.Country;
import iot.spring.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository currencyRepository;

    public List<Country> findAll() throws Exception {
        List<Country> countries = new LinkedList<>(currencyRepository.findAll());
        if (countries.isEmpty()) {
            return null;
        }
        return countries;
    }

    public Country findById(Integer id) throws Exception {
        if (currencyRepository.findById(id).isPresent()) {
            return currencyRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Country entity) throws Exception {
        if (entity != null) {
            currencyRepository.save(entity);
        }
    }

    @Transactional
    public void update(Country country) throws Exception {
        currencyRepository.findById(country.getId())
                .map(oldEntity -> {
                    oldEntity.setName(country.getName());
                    oldEntity.setTax(country.getTax());
                    return currencyRepository.save(oldEntity);
                })
                .orElseGet(() -> currencyRepository.save(country));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (currencyRepository.findById(id).isPresent()) {
            currencyRepository.delete(findById(id));
        }
    }
}

