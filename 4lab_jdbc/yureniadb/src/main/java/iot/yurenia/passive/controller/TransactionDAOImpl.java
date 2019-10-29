package iot.yurenia.passive.controller;

import iot.yurenia.passive.Application;
import iot.yurenia.passive.model.Product;
import iot.yurenia.passive.model.Transaction;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class TransactionDAOImpl {

    private Transaction extractTransactionFromResultSet(ResultSet rs) throws SQLException {
        Transaction transaction = new Transaction();
        transaction.setId( rs.getInt("id") );
        transaction.setTransactionInfo(rs.getString("transaction_info") );
        transaction.setAmount(rs.getDouble("amount"));
        transaction.setBusinessId(rs.getInt("business_id"));
        transaction.setPrivateAccountId(rs.getInt("private_account_id"));
        transaction.setBankId(rs.getInt("bank_id"));
        return transaction;
    }

    //GET 1

    public Transaction getTransaction(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM transaction WHERE id=" + id);
            if(rs.next())
            {
                return extractTransactionFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //GET all

    public Set getAllTransactions() {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM transaction");
            Set transactions = new HashSet();
            while (rs.next()) {
                Transaction transaction = extractTransactionFromResultSet(rs);
                transactions.add(transaction);
            }
            return transactions;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //PUT

    public boolean insertTransaction(Transaction transaction) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO transaction VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)");
            if (valueSetter(transaction, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private boolean valueSetter(Transaction transaction, PreparedStatement ps) throws SQLException {
        ps.setInt(1, transaction.getId());
        ps.setString(2, transaction.getTransactionInfo());
        ps.setDouble(3, transaction.getAmount());
        ps.setInt(4, transaction.getBusinessId());
        ps.setInt(5, transaction.getPrivateAccountId());
        ps.setInt(6, transaction.getBankId());
        ps.setString(7, transaction.getTransactionCode());
        int i = ps.executeUpdate();
        if(i == 1) {
            return true;
        }
        return false;
    }

    //UPDATE

    public boolean updateTransaction(Transaction transaction) {
        Connection connection = Application.getConnection();
        try {
            PreparedStatement ps =
                    connection.prepareStatement(
                            "UPDATE product SET name=?, price=?, quantity=?," +
                                    "business_id=? WHERE id=?");
            if (valueSetter(transaction, ps)) return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    //DELETE

    public boolean deleteTransaction(int id) {
        Connection connection = Application.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM transaction WHERE id=" + id);
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
