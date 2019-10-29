package iot.yurenia.passive.model;

public class CustomerPassword {

    private Integer customerId;
    private String customerPassword;

    public CustomerPassword() {

    }

    public CustomerPassword(Integer customerId, String customerPassword) {
        this.customerId = customerId;
        this.customerPassword = customerPassword;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
}
