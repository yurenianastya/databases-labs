package iot.spring.domain;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "transaction", schema = "yurenia_db")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "transaction_info", length = 45)
    private String info;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "business_id")
    private Integer businessId;
    @Column(name = "private_account_id")
    private Integer customerId;
    @Column(name = "bank_id")
    private Integer bankId;
    @Column(name = "transaction_code")
    private String code;

    public Transaction(String info, BigDecimal amount, Integer businessId, Integer customerId, Integer bankId, String code) {
        this.info = info;
        this.amount = amount;
        this.businessId = businessId;
        this.customerId = customerId;
        this.bankId = bankId;
        this.code = code;
    }

    public Transaction() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;

        Transaction that = (Transaction) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getInfo() != null ? !getInfo().equals(that.getInfo()) : that.getInfo() != null) return false;
        if (getAmount() != null ? !getAmount().equals(that.getAmount()) : that.getAmount() != null) return false;
        if (getBusinessId() != null ? !getBusinessId().equals(that.getBusinessId()) : that.getBusinessId() != null)
            return false;
        if (getCustomerId() != null ? !getCustomerId().equals(that.getCustomerId()) : that.getCustomerId() != null)
            return false;
        if (getBankId() != null ? !getBankId().equals(that.getBankId()) : that.getBankId() != null) return false;
        return getCode() != null ? getCode().equals(that.getCode()) : that.getCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getInfo() != null ? getInfo().hashCode() : 0);
        result = 31 * result + (getAmount() != null ? getAmount().hashCode() : 0);
        result = 31 * result + (getBusinessId() != null ? getBusinessId().hashCode() : 0);
        result = 31 * result + (getCustomerId() != null ? getCustomerId().hashCode() : 0);
        result = 31 * result + (getBankId() != null ? getBankId().hashCode() : 0);
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", amount=" + amount +
                ", businessId=" + businessId +
                ", customerId=" + customerId +
                ", bankId=" + bankId +
                ", code='" + code + '\'' +
                '}';
    }
}
