package com.inheritance.abstractclasses;

public class TestCanines {

    public static void main(String[] args) {
        //Canine canine = new Canine();
        //Canine canine = new Dog();
        System.out.println("Dog");
        Dog dog = new Dog();
        printDetails(dog);
        System.out.println("Wolf");
        Wolf wolf = new Wolf();
        printDetails(wolf);

        System.out.println("Coyote");
        Coyote coyote = new Coyote();
        printDetails(coyote);
        //canine.walk();
    }

    public static void printDetails(Dog dog){
        dog.name = "Lucas";
        dog.walk();
        dog.ladrar();
        dog.aullar();
    }

    public static void printDetails(Wolf wolf){
        //dog.name = "Lucas";
        wolf.walk();
        //dog.ladrar();
        wolf.aullar();
    }

    public static void printDetails(Coyote coyote){
        //dog.name = "Lucas";
        coyote.walk();
        //dog.ladrar();
        coyote.aullar();
    }
}
