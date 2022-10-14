package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmployee {
    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure("hybernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Employe employe=new Employe();
        employe.setName("SrishtiJi");
        employe.setPhone("888");
        session.persist(employe);
        transaction.commit();
        sessionFactory.close();
    }
}
