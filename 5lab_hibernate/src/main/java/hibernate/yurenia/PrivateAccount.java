package hibernate.yurenia;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "private_account", schema = "yurenia_db")
public class PrivateAccount {
    private int id;
    private long accountNumber;
    private double accountBalance;
    private String ownersName;
    private int currencyId;
    private int customerId;
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
    @Column(name = "account_number", nullable = false)
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Basic
    @Column(name = "account_balance", nullable = false, precision = 0)
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Basic
    @Column(name = "owners_name", nullable = false, length = 45)
    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
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
    @Column(name = "customer_id", nullable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "transaction_id", nullable = false)
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public PrivateAccount() {
    }

    public PrivateAccount(int id, long accountNumber, long accountBalance,
                          String ownersName, int currencyId, int customerId, int transactionId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.ownersName = ownersName;
        this.currencyId = currencyId;
        this.customerId = customerId;
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivateAccount that = (PrivateAccount) o;

        if (id != that.id) return false;
        if (accountNumber != that.accountNumber) return false;
        if (accountBalance != that.accountBalance) return false;
        if (currencyId != that.currencyId) return false;
        if (customerId != that.customerId) return false;
        if (transactionId != that.transactionId) return false;
        if (ownersName != null ? !ownersName.equals(that.ownersName) : that.ownersName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAccountNumber(),
                getAccountBalance(), getOwnersName(),
                getCurrencyId(), getCustomerId(), getTransactionId());
    }
}
