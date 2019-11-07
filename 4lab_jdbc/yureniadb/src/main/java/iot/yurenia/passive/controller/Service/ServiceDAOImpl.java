package iot.yurenia.passive.controller.Service;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Service;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ServiceDAOImpl {

    private Service extractServiceFromResultSet(ResultSet rs) throws SQLException {
        Service service = new Service();
        service.setId( rs.getInt("id") );
        service.setName(rs.getString("name") );
        service.setPrice(rs.getDouble("price"));
        service.setQuantity(rs.getInt("quantity"));
        service.setBusinessId(rs.getInt("business_id"));
        System.out.println("Service ID: "+service.getId());
        System.out.println("Service name: "+service.getName());
        System.out.println("Service price: "+service.getPrice());
        System.out.println("Service quantity: "+service.getQuantity());
        System.out.println("Service business id: "+service.getBusinessId());
        return service;
    }

    //GET 1

    public Service getService(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM service WHERE id=" + id);
            if(rs.next())
            {
                return extractServiceFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllServices() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM service");
            Set services = new HashSet();
            while (rs.next()) {
                Service service = extractServiceFromResultSet(rs);
                System.out.println('\t');
                services.add(service);
            }
            return services;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertService(Service service) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO service(name, price, quantity, businessid) VALUES (?, ?, ?, ?)");
            ps.setString(1, service.getName());
            ps.setDouble(2, service.getPrice());
            ps.setInt(3, service.getQuantity());
            ps.setInt(4, service.getBusinessId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Service service, PreparedStatement ps) throws SQLException {
        ps.setInt(1, service.getId());
        ps.setString(2, service.getName());
        ps.setDouble(3, service.getPrice());
        ps.setInt(4, service.getQuantity());
        ps.setInt(5, service.getBusinessId());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateService(Service service) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE service SET name=?, price=?, quantity=?," +
                                    "business_id=? WHERE id=?");
            if (valueSetter(service, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteService(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM service WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
