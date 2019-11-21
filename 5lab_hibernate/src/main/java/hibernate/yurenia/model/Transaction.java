package hibernate.yurenia.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "transaction", schema = "yurenia_db")
public class Transaction {
    private int id;
    private String transactionInfo;
    private double amount;
    private int businessId;
    private int privateAccountId;
    private int bankId;
    private String transactionCode;

    public Transaction(int id, String info, Double amount, Integer businessID, Integer paID, Integer bankID, String code) {

    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "transaction_info", nullable = true, length = 45)
    public String getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(String transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 0)
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
    @Column(name = "private_account_id", nullable = false)
    public int getPrivateAccountId() {
        return privateAccountId;
    }

    public void setPrivateAccountId(int privateAccountId) {
        this.privateAccountId = privateAccountId;
    }

    @Basic
    @Column(name = "bank_id", nullable = false)
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "transaction_code", nullable = false, length = 45)
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Transaction() {
    }

    public Transaction(int id, String transactionInfo, long amount,
                       int businessId, int privateAccountId, int bankId, String transactionCode) {
        this.id = id;
        this.transactionInfo = transactionInfo;
        this.amount = amount;
        this.businessId = businessId;
        this.privateAccountId = privateAccountId;
        this.bankId = bankId;
        this.transactionCode = transactionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (id != that.id) return false;
        if (amount != that.amount) return false;
        if (businessId != that.businessId) return false;
        if (privateAccountId != that.privateAccountId) return false;
        if (bankId != that.bankId) return false;
        if (transactionInfo != null ? !transactionInfo.equals(that.transactionInfo) : that.transactionInfo != null)
            return false;
        if (transactionCode != null ? !transactionCode.equals(that.transactionCode) : that.transactionCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTransactionInfo(), getAmount(),
                getBusinessId(), getPrivateAccountId(), getBankId(), getTransactionCode());
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionInfo='" + transactionInfo + '\'' +
                ", amount=" + amount +
                ", businessId=" + businessId +
                ", privateAccountId=" + privateAccountId +
                ", bankId=" + bankId +
                ", transactionCode='" + transactionCode + '\'' +
                '}';
    }
}
