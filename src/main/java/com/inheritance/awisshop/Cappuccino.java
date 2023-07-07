package com.inheritance.awisshop;

import com.inheritance.coffeeshop.Coffee;

public class Cappuccino extends Coffee {
    public String foam;

    public String getFoam() {
        return foam;
    }

    public void setFoam(String foam) {
        this.foam = foam;
    }
}
