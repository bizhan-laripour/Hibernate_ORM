package com.hibernate_Inheritance.table_per_concrete_class;

import com.hibernate_Inheritance.table_per_concrete_class.annotation.entity.Animal;
import com.hibernate_Inheritance.table_per_concrete_class.annotation.entity.Dog;
import com.hibernate_Inheritance.table_per_concrete_class.annotation.entity.Cat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PerConcrete {

    public static void main(String[] args) {
        System.out.println("this is for inheritance");
        System.out.println("this is for per concrete class");
        System.out.println("-----------------------------------------------");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.config");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Animal animal = new Animal();
        animal.setGender("male");
        animal.setName("animal");

        Cat cat = new Cat();
        cat.setTail("tail");
        cat.setGender("male");
        cat.setName("cattyy");

        Dog dog = new Dog();
        dog.setVoice("hap");
        dog.setGender("female");
        dog.setName("dooggyy");

        session.save(animal);
        session.save(cat);
        session.save(dog);

        transaction.commit();;
        session.close();
        factory.close();

        System.out.println("end of the process");
    }
}
