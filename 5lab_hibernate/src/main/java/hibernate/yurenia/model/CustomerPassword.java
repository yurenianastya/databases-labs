package hibernate.yurenia.model;

import javax.persistence.*;

@Entity
@Table(name = "customer_password", schema = "yurenia_db")
public class CustomerPassword {
    private int customerId;
    private String customerPassword;

    @Id
    @Column(name = "customer_id", nullable = false)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_password", nullable = true, length = 45)
    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public CustomerPassword() {

    }

    public CustomerPassword(int customerId, String customerPassword) {
        this.customerId = customerId;
        this.customerPassword = customerPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerPassword that = (CustomerPassword) o;

        if (customerId != that.customerId) return false;
        if (customerPassword != null ? !customerPassword.equals(that.customerPassword) : that.customerPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerPassword != null ? customerPassword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerPassword{" +
                "customerId=" + customerId +
                ", customerPassword='" + customerPassword + '\'' +
                '}';
    }
}
