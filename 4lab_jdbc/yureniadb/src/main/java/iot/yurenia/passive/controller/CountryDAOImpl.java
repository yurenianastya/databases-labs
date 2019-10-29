package iot.yurenia.passive.controller;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Country;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CountryDAOImpl {

    private Country extractCountryFromResultSet(ResultSet rs) throws SQLException {
        Country country = new Country();
        country.setId( rs.getInt("id") );
        country.setName(rs.getString("name") );
        country.setTax( rs.getInt("tax") );
        return country;
    }

    //GET 1

    public Country getCountry(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM country WHERE id=" + id);
            if(rs.next()) {
                return extractCountryFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllCountries() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM country");
            Set countries = new HashSet();
            while (rs.next()) {
                Country country = extractCountryFromResultSet(rs);
                countries.add(country);
            }
            return countries;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertCountry(Country country) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO country VALUES (NULL, ?, ?, ?)");
            if (valueSetter(country, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Country country, PreparedStatement ps) throws SQLException {
        ps.setInt(1, country.getId());
        ps.setString(2, country.getName());
        ps.setInt(3, country.getTax());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateCountry(Country country) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE country SET name=?, tax=?, WHERE id=?");
            if (valueSetter(country, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteCountry(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM country WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
