package hibernate.yurenia.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_has_transaction", schema = "yurenia_db")
public class BankHasTransaction {
    private int bankId;
    private int transactionId;
    private int id;

    @Basic
    @Column(name = "bank_id", nullable = false)
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "transaction_id", nullable = false)
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BankHasTransaction() {
    }

    public BankHasTransaction(int bankId, int transactionId, int id) {
        this.bankId = bankId;
        this.transactionId = transactionId;
        this.id = id;
    }

    public BankHasTransaction(int bankId, int transactionId) {
        this.bankId = bankId;
        this.transactionId = transactionId;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankHasTransaction that = (BankHasTransaction) o;

        if (bankId != that.bankId) return false;
        if (transactionId != that.transactionId) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankId;
        result = 31 * result + transactionId;
        result = 31 * result + id;
        return result;
    }
}
