package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    static SessionFactory sessionFactory;

     static {
         StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                 .configure("hibernate.cfg.xml")
                 .build();
          Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
          sessionFactory = meta.getSessionFactoryBuilder().build();

     }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
//    public final static StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//    public  static final Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//    public static final SessionFactory factory = meta.getSessionFactoryBuilder().build();
//
//    public static final SessionFactory getSession() {
//        return factory;
//    }
}
