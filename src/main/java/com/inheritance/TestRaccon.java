package com.inheritance;

public class TestRaccon {

    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.sleep();
        mammal.wakeUp();
        mammal.walk();
        mammal.size = 100.0F;
        System.out.println(mammal.toString());


        System.out.println("=====RACCOON========");

        Raccon awis = new Raccon();
        awis.sleep();
        awis.eat();
        awis.walk();
        awis.wakeUp();
        awis.washingFood();
        awis.size = 45.00F;
        System.out.println(awis.toString());


        System.out.println("=====SEA WOLF========");
        SeaWolf pingu = new SeaWolf();
        pingu.swim();
        pingu.eat();
        pingu.sleep();
        pingu.size = 60.00F;
        pingu.setTypeOfFood("Herviboro");
        pingu.setAletas(3);
        System.out.println(pingu.toString());

        System.out.println("=====FELINE========");
        Feline leono = new Feline();
        leono.sleep();
        leono.purr();
        leono.size = 85.00F;
        leono.setTypeOfFood("Carnivoro");
        System.out.println(leono.toString());

        System.out.println("=====CAT========");
        Cat mamiau = new Cat();
        mamiau.walk();
        mamiau.purr();
        mamiau.sleep();
        mamiau.stealFish();
        mamiau.size = 30.00F;
        mamiau.setTypeOfFood("Carnivoro");
        System.out.println(mamiau.toString());
    }
}
