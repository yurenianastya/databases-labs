package hibernate.yurenia.dao;

import hibernate.yurenia.model.Currency;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CurrencyDAO {

    public Currency findByID(int id) {
        return HibernateSession.getSf().openSession().get(Currency.class, id);
    }

    public void save(Currency currency) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(currency);
        tx1.commit();
        session.close();
    }

    public void update(Currency currency) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(currency);
        tx1.commit();
        session.close();
    }
    public void delete(Currency currency) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(currency);
        tx1.commit();
        session.close();
    }

    public List<Currency> findAll() {
        List<Currency> currency = (List<Currency>)  HibernateSession.getSf().openSession().createQuery("From Currency ").list();
        return currency;
    }

}
