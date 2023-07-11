package com.inheritance.inmutableclass;

public final class Fruit {

    private final String name;
    private final String color;

    private Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }

    public static Fruit getInstance(String name, String color){
        return new Fruit(name, color);
    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

}
