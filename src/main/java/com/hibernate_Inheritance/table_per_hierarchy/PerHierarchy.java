package com.hibernate_Inheritance.table_per_hierarchy;

import com.hibernate_Inheritance.table_per_hierarchy.xml.entity.Animal;
import com.hibernate_Inheritance.table_per_hierarchy.xml.entity.Cat;
import com.hibernate_Inheritance.table_per_hierarchy.xml.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PerHierarchy {

    public static void main(String[] args) {
        System.out.println("this is hibernate inheritance");
        System.out.println("this is table per hierarchy");
        System.out.println("-----------------------------------------------------");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.config");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Animal animal = new Animal();
        animal.setName("animal");
        animal.setGender("male");

        Cat cat = new Cat();
        cat.setName("caty");
        cat.setGender("male");
        cat.setTail("yes");

        Dog dog = new Dog();
        dog.setName("dogy");
        dog.setGender("female");
        dog.setVoice("hap");

        session.save(animal);
        session.save(cat);
        session.save(dog);
        transaction.commit();
        session.close();
        factory.close();
    }
}
