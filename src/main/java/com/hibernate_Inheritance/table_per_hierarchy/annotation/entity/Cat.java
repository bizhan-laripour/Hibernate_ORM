package com.hibernate_Inheritance.table_per_hierarchy.annotation.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Animal {


    private String tail;

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
