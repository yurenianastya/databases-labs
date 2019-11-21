package hibernate.yurenia.dao;


import hibernate.yurenia.model.Bank;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BankDAO {

    public Bank findByID(int id) {
        return HibernateSession.getSf().openSession().get(Bank.class, id);
    }

    public void save(Bank bank) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(bank);
        tx1.commit();
        session.close();
    }

    public void update(Bank bank) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        if (bank != null) {
            session.update(bank);
        tx1.commit();
        session.close();
        }
    }

    public void delete(int id) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        Bank bank = session.get(Bank.class, id);
        if (bank != null) {
            session.delete(bank);
        tx1.commit();
        session.close();
        }
    }

    public List<Bank> findAll() {
        List<Bank> banks = (List<Bank>)  HibernateSession.getSf().openSession().createQuery("From Bank ").list();
        return banks;
    }

}
