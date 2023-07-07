package com.inheritance.awisshop;

import com.inheritance.coffeeshop.Coffee;

public class AwisShopTest {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        //System.out.println("flavor : " + coffee.flavor);
        System.out.println("size : " + coffee.size);
        //System.out.println("withSugar : " + coffee.withSugar);

        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Foam : " + cappuccino.foam);
        System.out.println("size : " + cappuccino.size);

        //System.out.println("withSugar : " + cappuccino.withSugar);
    }
}
