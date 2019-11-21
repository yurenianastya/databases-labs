package hibernate.yurenia.service;

import hibernate.yurenia.dao.CurrencyDAO;
import hibernate.yurenia.model.Currency;

import java.util.List;

public class CurrencyService {

    private CurrencyDAO currencyDAO = new CurrencyDAO();

    public CurrencyService() {
    }

    public Currency findCurrency(int id) {
        return currencyDAO.findByID(id);
    }

    public void saveCurrency(Currency currency) {
        currencyDAO.save(currency);
    }

    public void deleteCurrency(Currency currency) {
        currencyDAO.delete(currency);
    }

    public void updateCurrency(Currency currency) {
        currencyDAO.update(currency);
    }

    public List<Currency> findAllCurrencies() {
        return currencyDAO.findAll();
    }
}
