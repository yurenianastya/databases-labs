package iot.spring.domain;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "business_account", schema = "yurenia_db")
public class BusinessAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name="owner_company", length = 45)
    private String owner;
    @Column(name="balance")
    private BigDecimal balance;
    @Column(name="business_id")
    private Integer businessId;
    @Column(name="currency_id")
    private Integer currencyId;
    @Column(name="transaction_id")
    private Integer transactionId;

    public BusinessAccount(String owner, BigDecimal balance, Integer businessId, Integer currencyId, Integer transactionId) {
        this.owner = owner;
        this.balance = balance;
        this.businessId = businessId;
        this.currencyId = currencyId;
        this.transactionId = transactionId;
    }

    public BusinessAccount() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessAccount)) return false;

        BusinessAccount that = (BusinessAccount) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getOwner() != null ? !getOwner().equals(that.getOwner()) : that.getOwner() != null) return false;
        if (getBalance() != null ? !getBalance().equals(that.getBalance()) : that.getBalance() != null) return false;
        if (getBusinessId() != null ? !getBusinessId().equals(that.getBusinessId()) : that.getBusinessId() != null)
            return false;
        if (getCurrencyId() != null ? !getCurrencyId().equals(that.getCurrencyId()) : that.getCurrencyId() != null)
            return false;
        return getTransactionId() != null ? getTransactionId().equals(that.getTransactionId()) : that.getTransactionId() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        result = 31 * result + (getBusinessId() != null ? getBusinessId().hashCode() : 0);
        result = 31 * result + (getCurrencyId() != null ? getCurrencyId().hashCode() : 0);
        result = 31 * result + (getTransactionId() != null ? getTransactionId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", businessId=" + businessId +
                ", currencyId=" + currencyId +
                ", transactionId=" + transactionId +
                '}';
    }
}
