package iot.yurenia.passive.controller.Country;

import iot.yurenia.passive.model.Country;

import java.util.Set;

public interface CountryDAO {
    Country getCountry(int id);
    Set<Country> getAllCountries();
    boolean insertCountry(Country country);
    boolean updateCountry(Country country);
    boolean deleteCountry(int id);
}