package hibernate.yurenia.model;

import javax.persistence.*;

@Entity
@Table(name = "currency", schema = "yurenia_db")
public class Currency {
    private int id;
    private String name;
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
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "transaction_id", nullable = false)
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Currency() {
    }

    public Currency(String name, int transactionId) {
        this.name = name;
        this.transactionId = transactionId;
    }

    public Currency(int id, String name, int transactionId) {
        this.id = id;
        this.name = name;
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (id != currency.id) return false;
        if (transactionId != currency.transactionId) return false;
        if (name != null ? !name.equals(currency.name) : currency.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + transactionId;
        return result;
    }
}
