package com.inheritance.abstractclasses;
//Coyote is a Canine
public class Coyote extends Canine {

    @Override
    public void walk(){
        System.out.println("Walking in pack... ");
    }

    @Override
    public void aullar() {
        System.out.println("EL Coyote aulla a la luna");
    }
}
