package hibernate.yurenia.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "business_account", schema = "yurenia_db")
public class BusinessAccount {
    private int id;
    private String ownerCompany;
    private Double balance;
    private int businessId;
    private int currencyId;
    private int transactionId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "owner_company", nullable = false, length = 45)
    public String getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(String ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    @Basic
    @Column(name = "balance", nullable = true, precision = 0)
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "business_id", nullable = false)
    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    @Basic
    @Column(name = "currency_id", nullable = false)
    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    @Basic
    @Column(name = "transaction_id", nullable = false)
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public BusinessAccount() {
    }

    public BusinessAccount(int id, String ownerCompany, Double balance,
                           int businessId, int currencyId, int transactionId) {
        this.id = id;
        this.ownerCompany = ownerCompany;
        this.balance = balance;
        this.businessId = businessId;
        this.currencyId = currencyId;
        this.transactionId = transactionId;
    }

    public BusinessAccount(String ownerCompany, Double balance, int businessId,
                           int currencyId, int transactionId) {
        this.ownerCompany = ownerCompany;
        this.balance = balance;
        this.businessId = businessId;
        this.currencyId = currencyId;
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessAccount)) return false;
        BusinessAccount that = (BusinessAccount) o;
        return getId() == that.getId() &&
                getBusinessId() == that.getBusinessId() &&
                getCurrencyId() == that.getCurrencyId() &&
                getTransactionId() == that.getTransactionId() &&
                getOwnerCompany().equals(that.getOwnerCompany()) &&
                getBalance().equals(that.getBalance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getOwnerCompany(), getBalance(),
                getBusinessId(), getCurrencyId(),
                getTransactionId());
    }
}
