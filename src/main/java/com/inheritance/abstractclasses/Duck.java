package com.inheritance.abstractclasses;

public abstract class Duck {

    public String color;
    public String name;
    public char gender;

    public final void swim(){
        System.out.println("The duck is Swimming");
    }

    public void walk(){
        System.out.println("The duck is walking");
    }

    void eat(){
        System.out.println("The duck is eating");
    }

    public void fight(){
        System.out.println("The duck is fighting");
    }

    public static void doQuack(){
        System.out.println("Making noise...");
    }



}
