package hibernate.yurenia.util;

import hibernate.yurenia.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
    private static SessionFactory sf;

    private HibernateSession(){

    }

    public static SessionFactory getSf(){
        if (sf == null) {
            try {
                Configuration config = new Configuration().configure();
                config.addAnnotatedClass(Bank.class);
                config.addAnnotatedClass(BusinessAccount.class);
                config.addAnnotatedClass(Business.class);
                config.addAnnotatedClass(Country.class);
                config.addAnnotatedClass(Currency.class);
                config.addAnnotatedClass(Currency.class);
                config.addAnnotatedClass(Customer.class);
                config.addAnnotatedClass(PrivateAccount.class);
                config.addAnnotatedClass(Product.class);
                config.addAnnotatedClass(Service.class);
                config.addAnnotatedClass(Transaction.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
                sf = config.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println(":( Exception: " + e);
            }
        }
        return sf;
    }
}
