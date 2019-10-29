package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Country;

import java.util.Set;

public interface CountryDAO {
    Country getCountry();
    Set<Country> getAllCountries();
    boolean insertCountry();
    boolean updateCountry();
    boolean deleteCountry();
}