package iot.yurenia.passive.controller.Currency;

import iot.yurenia.passive.model.Currency;

import java.util.Set;

public interface CurrencyDAO {
    Currency getCurrency(int id);
    Set<Currency> getAllCurrencies();
    boolean insertCurrency(Currency currency);
    boolean updateCurrency(Currency currency);
    boolean deleteCurrency(int id);
}