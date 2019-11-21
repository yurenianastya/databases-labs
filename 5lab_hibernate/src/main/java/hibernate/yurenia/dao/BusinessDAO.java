package hibernate.yurenia.dao;


import hibernate.yurenia.model.Business;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BusinessDAO {

    public Business findByID(int id) {
        return HibernateSession.getSf().openSession().get(Business.class, id);
    }

    public void save(Business business) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(business);
        tx1.commit();
        session.close();
    }

    public void update(Business business) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(business);
        tx1.commit();
        session.close();
    }
    public void delete(Business business) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(business);
        tx1.commit();
        session.close();
    }

    public List<Business> findAll() {
        List<Business> businesses = (List<Business>)  HibernateSession.getSf().openSession().createQuery("From Business ").list();
        return businesses;
    }

}
