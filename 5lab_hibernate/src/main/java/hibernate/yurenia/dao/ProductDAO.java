package hibernate.yurenia.dao;


import hibernate.yurenia.model.Product;
import hibernate.yurenia.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {

    public Product findByID(int id) {
        return HibernateSession.getSf().openSession().get(Product.class, id);
    }

    public void save(Product product) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(product);
        tx1.commit();
        session.close();
    }

    public void update(Product product) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(product);
        tx1.commit();
        session.close();
    }
    public void delete(Product product) {
        Session session = HibernateSession.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(product);
        tx1.commit();
        session.close();
    }

    public List<Product> findAll() {
        List<Product> products = (List<Product>)  HibernateSession.getSf().openSession().createQuery("From Product ").list();
        return products;
    }

}
