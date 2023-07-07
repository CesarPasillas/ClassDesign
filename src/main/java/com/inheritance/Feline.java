package com.inheritance;

public class Feline extends Mammal {

    public Feline(){
        System.out.println("Creating a Feline");
    }

    public void purr(){
        System.out.println("Purring...");
    }

    @Override
    public String toString() {
        return "Feline{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", size=" + size +
                '}';
    }
}
