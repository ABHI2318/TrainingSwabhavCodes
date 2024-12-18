package com.aurion.model;

public class Prototype implements IPrototype {
    private String name;

    public Prototype(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public IPrototype clone() {
        return new Prototype(this.name);
    }

    @Override
    public void prototype() {
     
    }
}
