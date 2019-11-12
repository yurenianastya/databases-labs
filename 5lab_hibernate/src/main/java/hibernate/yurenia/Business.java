package hibernate.yurenia;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "business", schema = "yurenia_db")
public class Business {
    private int id;
    private String name;
    private String service;
    private String email;

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
    @Column(name = "service", nullable = false, length = 45)
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Business() {
    }

    public Business(int id, String name, String service, String email) {
        this.id = id;
        this.name = name;
        this.service = service;
        this.email = email;
    }

    public Business(String name, String service, String email) {
        this.name = name;
        this.service = service;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Business business = (Business) o;

        if (id != business.id) return false;
        if (name != null ? !name.equals(business.name) : business.name != null) return false;
        if (service != null ? !service.equals(business.service) : business.service != null) return false;
        if (email != null ? !email.equals(business.email) : business.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (service != null ? service.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}