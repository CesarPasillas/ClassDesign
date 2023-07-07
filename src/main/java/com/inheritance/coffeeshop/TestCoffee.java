package com.inheritance.coffeeshop;

import com.inheritance.awisshop.Cappuccino;

public class TestCoffee {

    public static void main(String[] args) {
        /*Coffee coffee = new Coffee();
        Coffee otherCoffe = new Coffee();
        Coffee latte = coffee;
        System.out.println("==== " + coffee.equals(otherCoffe));
        System.out.println("==== " + coffee.equals(coffee));
        System.out.println("==== " + coffee.equals(latte));*/

        Coffee coffee = new Coffee();
        System.out.println("flavor : " + coffee.flavor);
        System.out.println("size : " + coffee.size);
        System.out.println("withSugar : " + coffee.withSugar);

        Latte latte = new Latte();
        System.out.println("flavor : " + latte.flavor);
        System.out.println("size : " + latte.size);
        System.out.println("withSugar : " + latte.withSugar);
        System.out.println("Milk : " + latte.isWithMilk());

        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Foam : " + cappuccino.foam);
        System.out.println("size : " + cappuccino.size);
        System.out.println("withSugar : " + cappuccino.withSugar);


    }
}
