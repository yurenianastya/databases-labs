package iot.spring.domain;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "private_account", schema = "yurenia_db")
public class PrivateAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "account_number")
    private BigDecimal number;
    @Column(name = "account_balance")
    private BigDecimal balance;
    @Column(name = "owners_name", length = 45)
    private String name;
    @Column(name = "currency_id")
    private Integer currencyId;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "transaction_id")
    private Integer transactionId;

    public PrivateAccount(BigDecimal number, BigDecimal balance, String name, Integer currencyId, Integer customerId, Integer transactionId) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.currencyId = currencyId;
        this.customerId = customerId;
        this.transactionId = transactionId;
    }

    public PrivateAccount() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
        if (!(o instanceof PrivateAccount)) return false;

        PrivateAccount that = (PrivateAccount) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getNumber() != null ? !getNumber().equals(that.getNumber()) : that.getNumber() != null) return false;
        if (getBalance() != null ? !getBalance().equals(that.getBalance()) : that.getBalance() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getCurrencyId() != null ? !getCurrencyId().equals(that.getCurrencyId()) : that.getCurrencyId() != null)
            return false;
        if (getCustomerId() != null ? !getCustomerId().equals(that.getCustomerId()) : that.getCustomerId() != null)
            return false;
        return getTransactionId() != null ? getTransactionId().equals(that.getTransactionId()) : that.getTransactionId() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCurrencyId() != null ? getCurrencyId().hashCode() : 0);
        result = 31 * result + (getCustomerId() != null ? getCustomerId().hashCode() : 0);
        result = 31 * result + (getTransactionId() != null ? getTransactionId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrivateAccount{" +
                "id=" + id +
                ", number=" + number +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", currencyId=" + currencyId +
                ", customerId=" + customerId +
                ", transactionId=" + transactionId +
                '}';
    }
}
