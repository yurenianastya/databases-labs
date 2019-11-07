package iot.yurenia.passive.controller.Product;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Product;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ProductDAOImpl {

    private Product extractProductFromResultSet(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId( rs.getInt("id") );
        product.setName(rs.getString("name") );
        product.setPrice(rs.getDouble("price"));
        product.setQuantity(rs.getInt("quantity"));
        product.setBusinessId(rs.getInt("business_id"));
        System.out.println("Product ID: "+product.getId());
        System.out.println("Product name: "+product.getName());
        System.out.println("Product price: "+product.getPrice());
        System.out.println("Product quantity: "+product.getQuantity());
        System.out.println("Product business id: "+product.getBusinessId());
        return product;
    }

    //GET 1

    public Product getProduct(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM product WHERE id=" + id);
            if(rs.next())
            {
                return extractProductFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllProducts() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM product");
            Set products = new HashSet();
            while (rs.next()) {
                Product product = extractProductFromResultSet(rs);
                System.out.println('\t');
                products.add(product);
            }
            return products;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertProduct(Product product) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO product(name, price, quantity, businessid) VALUES (?, ?, ?, ?)");
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.setInt(4, product.getBusinessId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Product product, PreparedStatement ps) throws SQLException {
        ps.setInt(1, product.getId());
        ps.setString(2, product.getName());
        ps.setDouble(3, product.getPrice());
        ps.setInt(4, product.getQuantity());
        ps.setInt(5, product.getBusinessId());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateProduct(Product product) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE product SET name=?, price=?, quantity=?," +
                                    "business_id=? WHERE id=?");
            if (valueSetter(product, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteProduct(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM product WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
