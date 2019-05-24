package com.hibernate_Inheritance.table_per_concrete_class.annotation.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({@AttributeOverride(name = "id" ,column = @Column(name = "id")) , @AttributeOverride(name = "name" , column = @Column(name = "name")),
        @AttributeOverride(name = "gender" , column = @Column(name = "gender"))})
public class Cat extends Animal {

    private String tail;


    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
