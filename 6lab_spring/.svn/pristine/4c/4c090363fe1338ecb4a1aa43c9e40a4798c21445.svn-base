package iot.spring.service;

import iot.spring.domain.Currency;
import iot.spring.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;


@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public List<Currency> findAll() throws Exception {
        List<Currency> countries = new LinkedList<>(currencyRepository.findAll());
        if (countries.isEmpty()) {
            return null;
        }
        return countries;
    }

    public Currency findById(Integer id) throws Exception {
        if (currencyRepository.findById(id).isPresent()) {
            return currencyRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Currency entity) throws Exception {
        if (entity != null) {
            currencyRepository.save(entity);
        }
    }

    @Transactional
    public void update(Currency currency) throws Exception {
        currencyRepository.findById(currency.getId())
                .map(oldEntity -> {
                    oldEntity.setName(currency.getName());
                    oldEntity.setTransactionId(currency.getTransactionId());
                    return currencyRepository.save(oldEntity);
                })
                .orElseGet(() -> currencyRepository.save(currency));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (currencyRepository.findById(id).isPresent()) {
            currencyRepository.delete(findById(id));
        }
    }
}
