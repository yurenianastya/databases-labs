package iot.yurenia.passive.controller.Business;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Business;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class BusinessDAOImpl {

    private Business extractBusinessFromResultSet(ResultSet rs) throws SQLException {
        Business business = new Business();
        business.setName(rs.getString("name") );
        business.setService( rs.getString("service") );
        business.setEmail(rs.getString("email"));
        System.out.println("Business name: "+business.getName());
        System.out.println("Business service: "+business.getService());
        System.out.println("Business email: "+business.getEmail());
        return business;
    }

    //GET 1

    public Business getBusiness(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM business WHERE id=" + id);
            if(rs.next())
            {
                return extractBusinessFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllBusinesses() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM business");
            Set businesses = new HashSet();
            while (rs.next()) {
                Business business = extractBusinessFromResultSet(rs);
                System.out.println("\t");
                businesses.add(business);
            }
            return businesses;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertBusiness(Business business) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO business(name, service, email) VALUES (?, ?, ?)");
            ps.setString(1, business.getName());
            ps.setString(2, business.getService());
            ps.setString(3, business.getEmail());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Business business, PreparedStatement ps) throws SQLException {
        ps.setInt(1, business.getId());
        ps.setString(2, business.getName());
        ps.setString(3, business.getService());
        ps.setString(4, business.getEmail());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateBusiness(Business business) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE business SET name=?, service=?," +
                                    " email=? WHERE id=?");
            if (valueSetter(business, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteBusiness(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM business WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
