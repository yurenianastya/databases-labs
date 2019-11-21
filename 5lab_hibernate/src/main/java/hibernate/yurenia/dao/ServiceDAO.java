package hibernate.yurenia.dao;


import hibernate.yurenia.model.Service;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ServiceDAO {

    public Service findByID(int id) {
        return HibernateSession.getSf().openSession().get(Service.class, id);
    }

    public void save(Service service) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(service);
        tx1.commit();
        session.close();
    }

    public void update(Service service) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(service);
        tx1.commit();
        session.close();
    }
    public void delete(Service service) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(service);
        tx1.commit();
        session.close();
    }

    public List<Service> findAll() {
        List<Service> services = (List<Service>)  HibernateSession.getSf().openSession().createQuery("From Service ").list();
        return services;
    }

}
