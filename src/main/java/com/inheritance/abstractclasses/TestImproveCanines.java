package com.inheritance.abstractclasses;

public class TestImproveCanines {

    public static void main(String[] args) {

        System.out.println("==Dog==");
        Canine canine = new Dog();
        printDetails(canine);

        System.out.println("==Wolf==");
        Canine canine1 = new Wolf();
        printDetails(canine1);

        System.out.println("==Coyote==");
        Canine canine2 = new Coyote();
        printDetails(canine2);

        System.out.println("==Taco Bell Pet==");
        TacoBellPet perrito = new TacoBellPet();
        printDetails(perrito);

        System.out.println("==Canine==");
        Canine k9 = new Canine(){
            @Override
            public void aullar(){
                System.out.println("Sobrescribiendo el metodo en la clase abstracta");
            }
        };

        printDetails(k9);
    }

    public static void printDetails(Canine canine){

        canine.walk();
        canine.ladrar();
        canine.aullar();

    }
}
