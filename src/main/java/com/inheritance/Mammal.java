package com.inheritance;


//fully qualified class name
public class Mammal extends Object {

    public Mammal(){
        System.out.println("Creating a Mammal");
    }

    protected String typeOfFood = "Ovniboro";
    protected float size;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void wakeUp(){
        System.out.println("Waking up...");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", size=" + size +
                '}';
    }
}
