package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Customer;

import java.util.Set;

public interface CustomerDAO {
    Customer getCustomer();
    Set<Customer> getAllCustomers();
    boolean insertCustomer();
    boolean updateCusomter();
    boolean deleteCustomer();
}