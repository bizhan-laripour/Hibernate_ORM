package com.hibernate_Inheritance.table_per_concrete_class.annotation.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({@AttributeOverride(name = "id" ,column = @Column(name = "id")) , @AttributeOverride(name = "name" , column = @Column(name = "name")),
        @AttributeOverride(name = "gender" , column = @Column(name = "gender"))})
public class Dog extends Animal {

    private String voice;


    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
