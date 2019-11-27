package iot.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "currency", schema = "yurenia_db")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "transaction_id")
    private Integer transactionId;

    public Currency(String name, Integer transactionId) {
        this.name = name;
        this.transactionId = transactionId;
    }

    public Currency() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Currency)) return false;

        Currency currency = (Currency) o;

        if (getId() != null ? !getId().equals(currency.getId()) : currency.getId() != null) return false;
        if (getName() != null ? !getName().equals(currency.getName()) : currency.getName() != null) return false;
        return getTransactionId() != null ? getTransactionId().equals(currency.getTransactionId()) : currency.getTransactionId() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getTransactionId() != null ? getTransactionId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + transactionId +
                '}';
    }
}
