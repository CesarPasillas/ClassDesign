package com.inheritance.abstractclasses;

//Wolf Is a Canine
public class Wolf extends Canine{

    @Override
    public void walk(){
        System.out.println("Waling alone... ");
    }

    @Override
    public void aullar() {
        System.out.println("El Wolf aulla a la luna");
    }
}
