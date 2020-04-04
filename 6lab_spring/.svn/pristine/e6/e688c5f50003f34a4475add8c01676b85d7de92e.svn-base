package iot.spring.domain;


import javax.persistence.*;

@Entity
@Table(name = "country", schema = "yurenia_db")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "tax")
    private Integer tax;

    public Country(String name, Integer tax) {
        this.name = name;
        this.tax = tax;
    }

    public Country() {
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

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (getId() != null ? !getId().equals(country.getId()) : country.getId() != null) return false;
        if (getName() != null ? !getName().equals(country.getName()) : country.getName() != null) return false;
        return getTax() != null ? getTax().equals(country.getTax()) : country.getTax() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getTax() != null ? getTax().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tax=" + tax +
                '}';
    }
}
