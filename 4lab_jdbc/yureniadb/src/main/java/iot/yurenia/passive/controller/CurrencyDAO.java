package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Currency;

import java.util.Set;

public interface CurrencyDAO {
    Currency getCurrency();
    Set<Currency> getAllCurrencies();
    boolean insertCurrency();
    boolean updateCurrency();
    boolean deleteCurrency();
}