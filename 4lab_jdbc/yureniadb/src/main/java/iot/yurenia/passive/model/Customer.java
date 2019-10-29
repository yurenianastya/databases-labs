package iot.yurenia.passive.model;

public class Customer {

    private Integer id;
    private String name;
    private String surname;
    private Integer phoneNumber;
    private String email;
    private Double income;
    private Integer countryId;

    public Customer() {

    }

    public Customer(String name, String surname, Integer phone_number, String email,
                    Double income, Integer country_id) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phone_number;
        this.email = email;
        this.income = income;
        this.countryId = country_id;
    }

    public Customer(Integer id, String name, String surname, Integer phone_number, String email,
                    Double income, Integer country_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phone_number;
        this.email = email;
        this.income = income;
        this.countryId = country_id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Double getIncome() {
        return income;
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}
