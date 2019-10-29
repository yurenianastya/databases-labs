package iot.yurenia.passive.model;

public class Service {

    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
    private Integer businessId;

    public Service() {

    }

    public Service(String name, Double price,
                   Integer quantity, Integer businessId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.businessId = businessId;
    }

    public Service(Integer id, String name, Double price,
                   Integer quantity, Integer businessId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.businessId = businessId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }
}
