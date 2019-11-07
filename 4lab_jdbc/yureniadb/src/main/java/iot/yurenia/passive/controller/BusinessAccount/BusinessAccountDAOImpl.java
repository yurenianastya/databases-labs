package iot.yurenia.passive.controller.BusinessAccount;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.BusinessAccount;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class BusinessAccountDAOImpl {

    private BusinessAccount extractBAFromResultSet(ResultSet rs) throws SQLException {
        BusinessAccount ba = new BusinessAccount();
        ba.setId( rs.getInt("id") );
        ba.setOwnerCompany(rs.getString("owner_company"));
        ba.setBalance( rs.getDouble("balance") );
        ba.setBusinessId(rs.getInt("business_id"));
        ba.setCurrencyId(rs.getInt("currency_id"));
        ba.setTransactionId(rs.getInt("transaction_id"));
        System.out.println("BA ID: "+ba.getId());
        System.out.println("BA owner's name: "+ba.getOwnerCompany());
        System.out.println("BA balance: "+ba.getBalance());
        System.out.println("BA business id: "+ba.getBusinessId());
        System.out.println("BA currency id: "+ba.getCurrencyId());
        System.out.println("BA transaction id: "+ba.getTransactionId());
        return ba;
    }

    //GET 1

    public BusinessAccount getBA(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM business_account WHERE id=" + id);
            if(rs.next())
            {
                return extractBAFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllBA() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM business_account");
            Set banks = new HashSet();
            while (rs.next()) {
                BusinessAccount ba = extractBAFromResultSet(rs);
                System.out.println('\t');
                banks.add(ba);
            }
            return banks;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertBA(BusinessAccount ba) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO business_account VALUES (NULL, ?, ?, ?, ?, ?, ?)");
            if (valueSetter(ba, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(BusinessAccount ba, PreparedStatement ps) throws SQLException {
        ps.setInt(1, ba.getId());
        ps.setString(2, ba.getOwnerCompany());
        ps.setDouble(3, ba.getBalance());
        ps.setInt(4, ba.getBusinessId());
        ps.setInt(5, ba.getCurrencyId());
        ps.setInt(6, ba.getTransactionId());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateBA(BusinessAccount ba) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE business_account SET owner_company=?, balance=?," +
                                    " business_id=?, currency_id=?, transaction_id=? WHERE id=?");
            if (valueSetter(ba, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteBA(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM business_account WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
