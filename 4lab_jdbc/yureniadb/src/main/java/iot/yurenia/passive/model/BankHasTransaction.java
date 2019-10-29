package iot.yurenia.passive.model;

public class BankHasTransaction {

    private Integer id;
    private Integer bankId;
    private Integer transactionId;

    public BankHasTransaction() {

    }

    public BankHasTransaction(Integer bankId, Integer transactionId) {
        this.bankId = bankId;
        this.transactionId = transactionId;
    }

    public BankHasTransaction(Integer id, Integer bankId, Integer transactionId) {
        this.id = id;
        this.bankId = bankId;
        this.transactionId = transactionId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getBankId() {
        return bankId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
}
