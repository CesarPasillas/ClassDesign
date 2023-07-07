package com.inheritance;

public class Cat extends Feline {

    public Cat(){
        System.out.println("Creating a Cat");
    }

    public void stealFish(){
        System.out.println("Stealing a fish, it smell delicious");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", size=" + size +
                '}';
    }
}
