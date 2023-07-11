package com.inheritance.overriding;

public class SilvesterDuck extends Duck{

    String name;

    SilvesterDuck(String color){
        super(color);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void walk() {
        eat();
        swim();
        System.out.println("The Silverster Duck is walking");
    }

    //@Override
    public void eat(String food){
        //return "Pan";
        System.out.println("The Silvester Duck is eating " + food);
    }

    public void eat(){
        //return "Pan";
        System.out.println("The Silvester Duck is eating ");
    }


    @Override
    public SilvesterDuck makeDuckling() {

        SilvesterDuck silverterDuckling = new SilvesterDuck("Yellow");
        return silverterDuckling;
    }

    @Override
    public String otherMethod() {
        return "String";
    }

    public static void makeNoise(){
        System.out.println("Sonido de lucas");
    }

    public static void main(String[] args) {
        SilvesterDuck duck = new SilvesterDuck("Negro");
        duck.fight();
        duck.fly();
        duck.walk();
        makeNoise();
        Duck.makeNoise();
        Duck.name = "";
        duck.name = "Lucas";

        Duck patito = duck.makeDuckling();

    }
}
