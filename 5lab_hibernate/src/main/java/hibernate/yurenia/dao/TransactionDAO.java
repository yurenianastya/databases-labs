package hibernate.yurenia.dao;


import hibernate.yurenia.model.Transaction;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;

import java.util.List;

public class TransactionDAO {

    public Transaction findByID(int id) {
        return HibernateSession.getSf().openSession().get(Transaction.class, id);
    }

    public void save(Transaction service) {
        Session session = HibernateSession.getSf().openSession();
        org.hibernate.Transaction tx1 = session.beginTransaction();
        session.save(service);
        tx1.commit();
        session.close();
    }

    public void update(Transaction service) {
        Session session = HibernateSession.getSf().openSession();
        org.hibernate.Transaction tx1 = session.beginTransaction();
        session.update(service);
        tx1.commit();
        session.close();
    }
    public void delete(Transaction transaction) {
        Session session = HibernateSession.getSf().openSession();
        org.hibernate.Transaction tx1 = session.beginTransaction();
        session.delete(transaction);
        tx1.commit();
        session.close();
    }

    public List<Transaction> findAll() {
        List<Transaction> transactions = (List<Transaction>)  HibernateSession.getSf().openSession().createQuery("From Transaction ").list();
        return transactions;
    }

}
