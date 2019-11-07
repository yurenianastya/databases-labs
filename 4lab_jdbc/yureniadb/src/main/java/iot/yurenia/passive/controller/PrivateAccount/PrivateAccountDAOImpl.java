package iot.yurenia.passive.controller.PrivateAccount;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.PrivateAccount;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class PrivateAccountDAOImpl {

    private PrivateAccount extractPAFromResultSet(ResultSet rs) throws SQLException {
        PrivateAccount pa = new PrivateAccount();
        pa.setId( rs.getInt("id") );
        pa.setAccountNumber(rs.getInt("account_number") );
        pa.setAccountBalance( rs.getDouble("account_balance") );
        pa.setOwnersName( rs.getString("owners_name") );
        pa.setCurrencyId(rs.getInt("currency_id"));
        pa.setCustomerId(rs.getInt("business_id"));
        pa.setTransactionId(rs.getInt("transaction_id"));
        System.out.println("Private Account ID: "+pa.getId());
        System.out.println("Private Account number: "+pa.getAccountNumber());
        System.out.println("Private Account balance: "+pa.getAccountBalance());
        System.out.println("Private Account balance: "+pa.getOwnersName());
        System.out.println("Private Account currency: "+pa.getId());
        System.out.println("Private Account business: "+pa.getId());
        System.out.println("Private Account transaction: "+pa.getId());
        return pa;
    }

    //GET 1

    public PrivateAccount getPA(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM private_account WHERE id=" + id);
            if(rs.next())
            {
                return extractPAFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllPA() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM private_account");
            Set pas = new HashSet();
            while (rs.next()) {
                PrivateAccount pa = extractPAFromResultSet(rs);
                System.out.println('\t');
                pas.add(pa);
            }
            return pas;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertPA(PrivateAccount pa) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO private_account(account_number, account_balance," +
                            " owners_name, currency_id, customer_id, transaction_id)" +
                            " VALUES (?, ?, ?, ?, ?, ?)");
            ps.setInt(1, pa.getAccountNumber());
            ps.setDouble(2, pa.getAccountBalance());
            ps.setString(3, pa.getOwnersName());
            ps.setInt(4, pa.getCurrencyId());
            ps.setInt(5, pa.getCustomerId());
            ps.setInt(6, pa.getTransactionId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(PrivateAccount pa, PreparedStatement ps) throws SQLException {
        ps.setInt(1, pa.getId());
        ps.setInt(2, pa.getAccountNumber());
        ps.setDouble(3, pa.getAccountBalance());
        ps.setString(4, pa.getOwnersName());
        ps.setInt(5, pa.getCurrencyId());
        ps.setInt(6, pa.getCustomerId());
        ps.setInt(7, pa.getTransactionId());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updatePA(PrivateAccount pa) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE private_account SET account_number=?, account_balance=?," +
                                    " owners_name=?, currency_id=?, customer_id=?," +
                                    " transaction_id=? WHERE id=?");
            if (valueSetter(pa, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deletePA(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM private_account WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
