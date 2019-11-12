package hibernate.yurenia;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "service", schema = "yurenia_db")
public class Service {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int businessId;

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
    @Column(name = "price", nullable = false, precision = 0)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "business_id", nullable = false)
    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public Service() {
    }

    public Service(int id, String name, long price, int quantity, int businessId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.businessId = businessId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (id != service.id) return false;
        if (price != service.price) return false;
        if (quantity != service.quantity) return false;
        if (businessId != service.businessId) return false;
        if (name != null ? !name.equals(service.name) : service.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice(), getQuantity(), getBusinessId());
    }
}
