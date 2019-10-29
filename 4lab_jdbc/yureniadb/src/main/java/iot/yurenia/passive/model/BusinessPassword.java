package iot.yurenia.passive.model;

public class BusinessPassword {

    private Integer businessId;
    private String businessPassword;

    public BusinessPassword() {

    }

    public BusinessPassword(Integer customerId, String customerPassword) {
        this.businessId = customerId;
        this.businessPassword = customerPassword;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public String getBusinessPassword() {
        return businessPassword;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public void setBusinessPassword(String businessPassword) {
        this.businessPassword = businessPassword;
    }
}
