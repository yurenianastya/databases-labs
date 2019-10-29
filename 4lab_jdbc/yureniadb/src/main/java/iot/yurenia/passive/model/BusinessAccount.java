package iot.yurenia.passive.model;

public class BusinessAccount {

    private Integer id;
    private String ownerCompany;
    private Double balance;
    private Integer businessId;
    private Integer currencyId;
    private Integer transactionId;

    public BusinessAccount() {

    }

    public BusinessAccount(String ownerCompany, Double balance,
                           Integer businessId, Integer currencyId,
                           Integer transactionId) {
        this.ownerCompany = ownerCompany;
        this.balance = balance;
        this.businessId = businessId;
        this.currencyId = currencyId;
        this.transactionId = transactionId;
    }

    public BusinessAccount(Integer id, String ownerCompany, Double balance,
                           Integer businessId, Integer currencyId,
                           Integer transactionId) {
        this.id = id;
        this.ownerCompany = ownerCompany;
        this.balance = balance;
        this.businessId = businessId;
        this.currencyId = currencyId;
        this.transactionId = transactionId;
    }

    public Integer getId() {
        return id;
    }

    public String getOwnerCompany() {
        return ownerCompany;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwnerCompany(String ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
}