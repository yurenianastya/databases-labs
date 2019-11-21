package hibernate.yurenia.service;

import hibernate.yurenia.dao.CustomerDAO;
import hibernate.yurenia.model.Customer;

import java.util.List;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAO();

    public CustomerService() {
    }

    public Customer findCustomer(int id) {
        return customerDAO.findByID(id);
    }

    public void saveCustomer(Customer currency) {
        customerDAO.save(currency);
    }

    public void deleteCustomer(Customer currency) {
        customerDAO.delete(currency);
    }

    public void updateCustomer(Customer currency) {
        customerDAO.update(currency);
    }

    public List<Customer> findAllCurrencies() {
        return customerDAO.findAll();
    }
}
