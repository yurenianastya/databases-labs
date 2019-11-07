package iot.yurenia.passive.controller.Customer;

import iot.yurenia.passive.model.Customer;

import java.util.Set;

public interface CustomerDAO {
    Customer getCustomer(int id);
    Set<Customer> getAllCustomers();
    boolean insertCustomer(Customer customer);
    boolean updateCusomter(Customer customer);
    boolean deleteCustomer(int id);
}