package com.hibernate_Inheritance.table_per_subClass;

import com.hibernate_Inheritance.table_per_subClass.annotation.entity.Animal;
import com.hibernate_Inheritance.table_per_subClass.annotation.entity.Cat;
import com.hibernate_Inheritance.table_per_subClass.annotation.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PerSubClass {

    public static void main(String[] args) {


        Configuration configuration = new Configuration();
        configuration.configure("hibernate.config");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Animal animal = new Animal();
        animal.setName("animl");
        animal.setGender("male");

        Cat cat = new Cat();
        cat.setName("cat");
        cat.setGender("malefdf");
        cat.setTail("yesfd");

        Dog dog = new Dog();
        dog.setName("dogydf");
        dog.setGender("femalefd");
        dog.setVoice("hapdf");

        session.save(animal);
        session.save(cat);
        session.save(dog);
        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("this is end of the task");
    }


}
