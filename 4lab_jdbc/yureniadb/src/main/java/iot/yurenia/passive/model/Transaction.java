package iot.yurenia.passive.model;

public class Transaction {

    private Integer id;
    private String transactionInfo;
    private Double amount;
    private Integer businessId;
    private Integer privateAccountId;
    private Integer bankId;
    private String transactionCode;

    public Transaction() {

    }

    public Transaction(String transactionInfo, Double amount,
                       Integer businessId, Integer privateAccountId,
                       Integer bankId, String transactionCode) {
        this.transactionInfo = transactionInfo;
        this.amount = amount;
        this.businessId = businessId;
        this.privateAccountId = privateAccountId;
        this.bankId = bankId;
        this.transactionCode = transactionCode;
    }

    public Transaction(Integer id, String transactionInfo, Double amount,
                       Integer businessId, Integer privateAccountId,
                       Integer bankId, String transactionCode) {
        this.id = id;
        this.transactionInfo = transactionInfo;
        this.amount = amount;
        this.businessId = businessId;
        this.privateAccountId = privateAccountId;
        this.bankId = bankId;
        this.transactionCode = transactionCode;
    }

    public Integer getId() {
        return id;
    }

    public String getTransactionInfo() {
        return transactionInfo;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public Integer getPrivateAccountId() {
        return privateAccountId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTransactionInfo(String transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public void setPrivateAccountId(Integer privateAccountId) {
        this.privateAccountId = privateAccountId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
}
