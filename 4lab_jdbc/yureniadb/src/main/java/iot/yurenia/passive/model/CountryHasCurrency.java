package iot.yurenia.passive.model;

public class CountryHasCurrency {

    private Integer id;
    private Integer countryId;
    private Integer currencyId;

    public CountryHasCurrency() {

    }

    public CountryHasCurrency(Integer countryId, Integer currencyId) {
        this.countryId = countryId;
        this.currencyId = currencyId;
    }

    public CountryHasCurrency(Integer id, Integer countryId, Integer currencyId) {
        this.id = id;
        this.countryId = countryId;
        this.currencyId = currencyId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }
}
