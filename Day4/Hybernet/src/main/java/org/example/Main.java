package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SessionFactory sessionFactory= new Configuration().configure("hybernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Person person=new Person();
        person.setName("Srishti");
        person.setPhone("999");
        person.setPid(01);
        session.persist(person);
        transaction.commit();
        session.close();
    }

}