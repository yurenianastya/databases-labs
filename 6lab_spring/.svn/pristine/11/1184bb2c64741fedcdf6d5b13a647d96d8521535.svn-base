package iot.spring.domain;


import javax.persistence.*;

@Entity
@Table(name = "business", schema = "yurenia_db")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "service", length = 45)
    private String service;
    @Column(name = "email", length = 45)
    private String email;

    public Business(String name, String service, String email) {
        this.name = name;
        this.service = service;
        this.email = email;
    }

    public Business() {
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Business)) return false;

        Business business = (Business) o;

        if (getId() != null ? !getId().equals(business.getId()) : business.getId() != null) return false;
        if (getName() != null ? !getName().equals(business.getName()) : business.getName() != null) return false;
        if (getService() != null ? !getService().equals(business.getService()) : business.getService() != null)
            return false;
        return getEmail() != null ? getEmail().equals(business.getEmail()) : business.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getService() != null ? getService().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", service='" + service + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
