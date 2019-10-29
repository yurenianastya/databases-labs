package iot.yurenia.passive.controller;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Customer;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CustomerDAOImpl {

    private Customer extractCustomerFromResultSet(ResultSet rs) throws SQLException {
        Customer customer = new Customer();
        customer.setId( rs.getInt("id") );
        customer.setName(rs.getString("name") );
        customer.setSurname( rs.getString("surname") );
        customer.setPhoneNumber(rs.getInt("phone_number"));
        customer.setEmail(rs.getString("email"));
        customer.setIncome(rs.getDouble("income"));
        customer.setCountryId(rs.getInt("country_id"));
        return customer;
    }

    //GET 1

    public Customer getCustomer(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE id=" + id);
            if(rs.next())
            {
                return extractCustomerFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllCustomers() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            Set customers = new HashSet();
            while (rs.next()) {
                Customer ba = extractCustomerFromResultSet(rs);
                customers.add(ba);
            }
            return customers;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertCustomer(Customer customer) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO customer VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)");
            if (valueSetter(customer, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Customer customer, PreparedStatement ps) throws SQLException {
        ps.setInt(1, customer.getId());
        ps.setString(2, customer.getName());
        ps.setString(3, customer.getSurname());
        ps.setInt(4, customer.getPhoneNumber());
        ps.setString(5, customer.getEmail());
        ps.setDouble(6, customer.getIncome());
        ps.setInt(7, customer.getCountryId());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateCustomer(Customer customer) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE customer SET name=?, surname=?," +
                                    " phone_number=?, email=?, income=?, country_id=? WHERE id=?");
            if (valueSetter(customer, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteCustomer(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM customer WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
