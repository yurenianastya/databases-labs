package iot.yurenia.passive.model;

public class PrivateAccount {

    private Integer id;
    private Integer accountNumber;
    private Double accountBalance;
    private String ownersName;
    private Integer currencyId;
    private Integer customerId;
    private Integer transactionId;

    public PrivateAccount() {

    }

    public PrivateAccount(Integer accountNumber, Double accountBalance,
                          String ownersName, Integer currencyId, Integer customerId,
                          Integer transactionId) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.ownersName = ownersName;
        this.currencyId = currencyId;
        this.customerId = customerId;
        this.transactionId = transactionId;
    }

    public PrivateAccount(Integer id, Integer accountNumber, Double accountBalance,
                          String ownersName, Integer currencyId, Integer customerId,
                          Integer transactionId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.ownersName = ownersName;
        this.currencyId = currencyId;
        this.customerId = customerId;
        this.transactionId = transactionId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
}
