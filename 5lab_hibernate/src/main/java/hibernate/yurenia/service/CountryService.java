package hibernate.yurenia.service;

import hibernate.yurenia.dao.CountryDAO;
import hibernate.yurenia.model.Country;

import java.util.List;

public class CountryService {

    private CountryDAO countryDAO = new CountryDAO();

    public CountryService() {
    }

    public Country findCountry(int id) {
        return countryDAO.findByID(id);
    }

    public void saveCountry(Country country) {
        countryDAO.save(country);
    }

    public void deleteCountry(Country country) {
        countryDAO.delete(country);
    }

    public void updateCountry(Country country) {
        countryDAO.update(country);
    }

    public List<Country> findAllCountries() {
        return countryDAO.findAll();
    }
}
