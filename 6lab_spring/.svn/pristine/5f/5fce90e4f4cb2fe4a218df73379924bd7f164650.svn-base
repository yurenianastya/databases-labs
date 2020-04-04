package iot.spring.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bank", schema = "yurenia_db")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    public Bank(String name, Integer countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public Bank() {
    }

    public Integer getId() {return  id;}

    public void setId(Integer id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;

        Bank bank = (Bank) o;

        if (!Objects.equals(id, bank.id)) return false;
        if (getName() != null ? !getName().equals(bank.getName()) : bank.getName() != null) return false;
        return getCountryId() != null ? getCountryId().equals(bank.getCountryId()) : bank.getCountryId() == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCountryId() != null ? getCountryId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId='" + countryId + '\'' +
                '}';
    }
}
