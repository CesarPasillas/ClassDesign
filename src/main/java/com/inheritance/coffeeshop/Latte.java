package com.inheritance.coffeeshop;

public class Latte extends Coffee {
    private boolean withMilk;

    public boolean isWithMilk() {
        return withMilk;
    }

    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }
}
