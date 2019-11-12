package hibernate.yurenia;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "yurenia_db")
public class Product {
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

    public Product() {
    }

    public Product(int id, String name, long price, int quantity, int businessId) {
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

        Product product = (Product) o;

        if (id != product.id) return false;
        if (price != product.price) return false;
        if (quantity != product.quantity) return false;
        if (businessId != product.businessId) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(),
                getPrice(), getQuantity(), getBusinessId());
    }
}
