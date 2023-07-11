package com.inheritance.inmutableclass;

public final class Tree {

    private final String name;
    private final Fruit fruit;

    private Tree(String name, Fruit fruit){
        this.name = name;
        this.fruit = fruit;
    }

    public static Tree getInstance(String name, Fruit fruit){
        return new Tree(name, fruit);
    }

    public Fruit getFruit() {
        return fruit;
    }

    public String getName() {
        return name;
    }
}
