package hibernate.yurenia;

import javax.persistence.*;

@Entity
@Table(name = "bank_password", schema = "yurenia_db")
public class BankPassword {
    private int bankId;
    private String bankPassword;

    @Id
    @Column(name = "bank_id", nullable = false)
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Basic
    @Column(name = "bank_password", nullable = false, length = 45)
    public String getBankPassword() {
        return bankPassword;
    }

    public void setBankPassword(String bankPassword) {
        this.bankPassword = bankPassword;
    }

    public BankPassword() {
    }

    public BankPassword(int bankId, String bankPassword) {
        this.bankId = bankId;
        this.bankPassword = bankPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankPassword that = (BankPassword) o;

        if (bankId != that.bankId) return false;
        if (bankPassword != null ? !bankPassword.equals(that.bankPassword) : that.bankPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bankId;
        result = 31 * result + (bankPassword != null ? bankPassword.hashCode() : 0);
        return result;
    }
}
