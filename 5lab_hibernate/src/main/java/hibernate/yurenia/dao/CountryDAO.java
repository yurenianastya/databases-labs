package hibernate.yurenia.dao;


import hibernate.yurenia.model.Country;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CountryDAO {

    public Country findByID(int id) {
        return HibernateSession.getSf().openSession().get(Country.class, id);
    }

    public void save(Country country) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(country);
        tx1.commit();
        session.close();
    }

    public void update(Country country) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(country);
        tx1.commit();
        session.close();
    }
    public void delete(Country country) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(country);
        tx1.commit();
        session.close();
    }

    public List<Country> findAll() {
        List<Country> countries = (List<Country>)  HibernateSession.getSf().openSession().createQuery("From Country ").list();
        return countries;
    }

}
