package com.inheritance.thissuper;

public class Reptile {

    public int speed = 10;
    protected String color;

    public Reptile(String color){
        this.color = color;
    }

    public Reptile(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    public void printSpeed(int speed ){
        System.out.println("Reptile speed : " + speed);
        String out = toString();
        System.out.println(out);
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Reptile reptile = new Reptile("Morado");
        reptile.printSpeed(20);
    }
}
