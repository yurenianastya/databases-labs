package hibernate.yurenia.dao;


import hibernate.yurenia.model.PrivateAccount;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PrivateAccountDAO {

    public PrivateAccount findByID(int id) {
        return HibernateSession.getSf().openSession().get(PrivateAccount.class, id);
    }

    public void save(PrivateAccount pa) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(pa);
        tx1.commit();
        session.close();
    }

    public void update(PrivateAccount pa) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(pa);
        tx1.commit();
        session.close();
    }
    public void delete(PrivateAccount pa) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(pa);
        tx1.commit();
        session.close();
    }

    public List<PrivateAccount> findAll() {
        List<PrivateAccount> paccounts = (List<PrivateAccount>)  HibernateSession.getSf().openSession().createQuery("From PrivateAccount ").list();
        return paccounts;
    }

}
