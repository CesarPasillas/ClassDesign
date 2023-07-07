package com.inheritance.intialization;

public class Car2 {

    char color;
    int noTires;
    String type;

    /*{
        type = "sedan";
    }*/

    Car2(){
        color = 'R';
        noTires = 4;
        type = "sedan";
    }

    Car2(char color, int noTires){
        this.color = color;
        this.noTires = noTires;
        System.out.println("Creating a car...");
    }

    Car2(char color, int noTires, String type){
        this.color = color;
        this.noTires = noTires;
        this.type = type;
        System.out.println("Creating a car...");
    }

    public static void main(String[] args) {
        Car2 car = new Car2('N',3, "truck");
        //Car2 car = new Car2();
        System.out.println("color : " +car.color);
        System.out.println("No Tires : " + car.noTires);
        System.out.println("Car Type : " + car.type);
    }
}
