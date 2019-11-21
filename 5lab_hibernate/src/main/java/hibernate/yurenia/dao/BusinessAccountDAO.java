package hibernate.yurenia.dao;


import hibernate.yurenia.model.BusinessAccount;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BusinessAccountDAO {

    public BusinessAccount findByID(int id) {
        return HibernateSession.getSf().openSession().get(BusinessAccount.class, id);
    }

    public void save(BusinessAccount ba) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(ba);
        tx1.commit();
        session.close();
    }

    public void update(BusinessAccount ba) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(ba);
        tx1.commit();
        session.close();
    }
    public void delete(BusinessAccount ba) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(ba);
        tx1.commit();
        session.close();
    }

    public List<BusinessAccount> findAll() {
        List<BusinessAccount> banks = (List<BusinessAccount>)  HibernateSession.getSf().openSession().createQuery("From BusinessAccount ").list();
        return banks;
    }

}
