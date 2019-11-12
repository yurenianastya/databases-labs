package hibernate.yurenia;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "country", schema = "yurenia_db")
public class Country {
    private int id;
    private String name;
    private int tax;

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
    @Column(name = "tax", nullable = false)
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public Country() {
    }

    public Country(int id, String name, int tax) {
        this.id = id;
        this.name = name;
        this.tax = tax;
    }

    public Country(String name, int tax) {
        this.name = name;
        this.tax = tax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        if (tax != country.tax) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + tax;
        return result;
    }
}