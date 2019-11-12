package hibernate.yurenia;

import javax.persistence.*;

@Entity
@Table(name = "country_has_currency", schema = "yurenia_db")
public class CountryHasCurrency {
    private int countryId;
    private int currencyId;
    private int id;

    @Basic
    @Column(name = "country_id", nullable = false)
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "currency_id", nullable = false)
    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryHasCurrency() {
    }

    public CountryHasCurrency(int countryId, int currencyId) {
        this.countryId = countryId;
        this.currencyId = currencyId;
    }

    public CountryHasCurrency(int countryId, int currencyId, int id) {
        this.countryId = countryId;
        this.currencyId = currencyId;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryHasCurrency that = (CountryHasCurrency) o;

        if (countryId != that.countryId) return false;
        if (currencyId != that.currencyId) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId;
        result = 31 * result + currencyId;
        result = 31 * result + id;
        return result;
    }
}
