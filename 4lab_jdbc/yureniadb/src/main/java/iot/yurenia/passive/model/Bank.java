package iot.yurenia.passive.model;

public class Bank {

    private Integer id;
    private String name;
    private Integer countryId;

    public Bank() {

    }

    public Bank(String name, Integer countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public Bank(Integer id, String name, Integer countryId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}
