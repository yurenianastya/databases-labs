package hibernate.yurenia.model;

import javax.persistence.*;

@Entity
@Table(name = "business_password", schema = "yurenia_db")
public class BusinessPassword {
    private int businessId;
    private String businessPassword;

    @Id
    @Column(name = "business_id", nullable = false)
    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    @Basic
    @Column(name = "business_password", length = 45)
    public String getBusinessPassword() {
        return businessPassword;
    }

    public void setBusinessPassword(String businessPassword) {
        this.businessPassword = businessPassword;
    }

    public BusinessPassword() {
    }

    public BusinessPassword(int businessId, String businessPassword) {
        this.businessId = businessId;
        this.businessPassword = businessPassword;
    }

    public BusinessPassword(String businessPassword) {
        this.businessPassword = businessPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessPassword that = (BusinessPassword) o;

        if (businessId != that.businessId) return false;
        if (businessPassword != null ? !businessPassword.equals(that.businessPassword) : that.businessPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = businessId;
        result = 31 * result + (businessPassword != null ? businessPassword.hashCode() : 0);
        return result;
    }
}
