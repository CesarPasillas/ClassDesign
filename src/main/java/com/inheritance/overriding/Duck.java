package com.inheritance.overriding;

public class Duck {

    String color;

    Duck(String color){
        this.color = color;
    }

    public void swim(){
        System.out.println("The duck is Swimming");
    }

    public void walk(){
        System.out.println("The duck is walking");
    }

    public void fly(){
        System.out.println("The duck is flying");
    }

    void eat(){
        System.out.println("The duck is eating");
    }

    public void fight(){
        System.out.println("The duck is fighting");
    }

    public Duck makeDuckling(){
        Duck duckling = new Duck("Yellow");
        return duckling;
    }

    public CharSequence otherMethod(){
        return "Charsecuence";
    }


    public static void makeNoise(){
        System.out.println("Making noise...");
    }
}
