package hibernate.yurenia.dao;


import hibernate.yurenia.model.Customer;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDAO {

    public Customer findByID(int id) {
        return HibernateSession.getSf().openSession().get(Customer.class, id);
    }

    public void save(Customer customer) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(customer);
        tx1.commit();
        session.close();
    }

    public void update(Customer customer) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(customer);
        tx1.commit();
        session.close();
    }
    public void delete(Customer customer) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(customer);
        tx1.commit();
        session.close();
    }

    public List<Customer> findAll() {
        List<Customer> customers = (List<Customer>)  HibernateSession.getSf().openSession().createQuery("From Customer ").list();
        return customers;
    }

}
