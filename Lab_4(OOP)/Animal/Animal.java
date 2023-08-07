package com.nstu;

public abstract class Animal {
    private String NAME;

    public String getName(){
        return NAME;
    }
    public void setName(String NAME){
        this.NAME=NAME;
    }

    abstract void eat();
}
