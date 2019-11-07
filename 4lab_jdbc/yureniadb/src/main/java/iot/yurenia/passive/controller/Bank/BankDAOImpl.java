package iot.yurenia.passive.controller.Bank;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Bank;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class BankDAOImpl {

    private Bank extractBankFromResultSet(ResultSet rs) throws SQLException {
        Bank bank = new Bank();
        bank.setId( rs.getInt("id") );
        bank.setName( rs.getString("name") );
        bank.setCountryId( rs.getInt("country_id") );
        System.out.println("Bank_ID: " + bank.getId());
        System.out.println("Bank_Name: " + bank.getName());
        System.out.println("Bank_CountryID: " + bank.getCountryId());
        return bank;
    }

    //GET 1

    public Bank getBank(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bank WHERE id=" + id);
            if(rs.next())
            {
                return extractBankFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllBanks() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bank");
            Set banks = new HashSet();
            while (rs.next()) {
                Bank bank = extractBankFromResultSet(rs);
                System.out.println("\t");
                banks.add(bank);
            }
            return banks;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertBank(Bank bank) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO bank(name, country_id) VALUES (?, ?)");
            ps.setString(1, bank.getName());
            ps.setInt(2, bank.getCountryId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //UPDATE

    public boolean updateBank(Bank bank) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE bank SET name=?, country_id=? WHERE id=?");
            ps.setString(1, bank.getName());
            ps.setInt(2, bank.getCountryId());
            ps.setInt(3, bank.getId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteBank(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM bank WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
