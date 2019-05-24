package com.hibernate_Inheritance.table_per_hierarchy.xml.entity;

public class Dog extends Animal {

    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
