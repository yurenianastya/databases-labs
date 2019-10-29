package iot.yurenia.passive.controller;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Currency;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CurrencyDAOImpl {

    private Currency extractCurrencyFromResultSet(ResultSet rs) throws SQLException {
        Currency currency = new Currency();
        currency.setId( rs.getInt("id") );
        currency.setName(rs.getString("name") );
        currency.setTransactionId(rs.getInt("transaction_id"));
        return currency;
    }

    //GET 1

    public Currency getCurrency(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM currency WHERE id=" + id);
            if(rs.next())
            {
                return extractCurrencyFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllCurrencies() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM currency");
            Set currencies = new HashSet();
            while (rs.next()) {
                Currency currency = extractCurrencyFromResultSet(rs);
                currencies.add(currency);
            }
            return currencies;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertBA(Currency currency) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO currency VALUES (NULL, ?, ?, ?)");
            if (valueSetter(currency, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Currency currency, PreparedStatement ps) throws SQLException {
        ps.setInt(1, currency.getId());
        ps.setString(2, currency.getName());
        ps.setInt(6, currency.getTransactionId());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateCurrency(Currency currency) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE currency SET name=?, transaction_id=? WHERE id=?");
            if (valueSetter(currency, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteCurrency(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM currency WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
