package iot.yurenia.passive.model;

public class Country {

    private Integer id;
    private String name;
    private Integer tax;

    public Country() {

    }

    public Country(String name, Integer tax) {
        this.name = name;
        this.tax = tax;
    }

    public Country(Integer id, String name, Integer tax) {
        this.id = id;
        this.name = name;
        this.tax = tax;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTax() {
        return tax;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }
}
