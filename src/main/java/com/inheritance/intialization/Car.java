package com.inheritance.intialization;

public class Car {

    char color;

    int noTires;

    {
        color = 'r';
        noTires = 4;
    }

    Car(){
        System.out.println("Creating a car...");
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.noTires);
    }
}
