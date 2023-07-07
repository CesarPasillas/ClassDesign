package com.inheritance;

public class SeaWolf extends Mammal {

    private int aletas;

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public void swim(){
        System.out.println("Swimming in the cold water...");
    }

    @Override
    public String toString() {
        return "SeaWolf{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", size=" + size +
                ", aletas=" + aletas +
                '}';
    }
}
