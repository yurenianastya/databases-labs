package iot.yurenia.passive.model;

public class Currency {

    private Integer id;
    private String name;
    private Integer transactionId;

    public Currency() {

    }

    public Currency(String name, Integer transaction_id) {
        this.name = name;
        this.transactionId = transaction_id;
    }

    public Currency(Integer id, String name, Integer transaction_id) {
        this.id = id;
        this.name = name;
        this.transactionId = transaction_id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

}
