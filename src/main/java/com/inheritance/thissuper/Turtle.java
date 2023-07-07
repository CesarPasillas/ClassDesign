package com.inheritance.thissuper;

public class Turtle extends Reptile{

    public int speed = 2;

    public Turtle(String color){
        //super(color);
        super(color, 6);
    }

    @Override
    public void printSpeed(int speed ){
        System.out.println("Turtle speed : " + speed);
        System.out.println("Turtle color : " + color);
        System.out.println("Turtle this.color : " + this.color);
        System.out.println("Turtle super.color : " + super.color);
        System.out.println(toString());
        System.out.println(this.toString());
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle("Verde");
        turtle.printSpeed(5);
    }
}
