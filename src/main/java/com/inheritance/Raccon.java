package com.inheritance;

public class Raccon extends Mammal {

    public void washingFood(){
        System.out.println("Washing Food...");
    }

    @Override
    public String toString() {
        return "Raccon{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", size=" + size +
                '}';
    }
}
