package iot.yurenia.passive.model;

public class BankPassword {

    private Integer bankId;
    private String bankPassword;

    public BankPassword() {

    }

    public BankPassword(Integer customerId, String customerPassword) {
        this.bankId = customerId;
        this.bankPassword = customerPassword;
    }

    public Integer getBankId() {
        return bankId;
    }

    public String getBankPassword() {
        return bankPassword;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public void setBankPassword(String bankPassword) {
        this.bankPassword = bankPassword;
    }
}
