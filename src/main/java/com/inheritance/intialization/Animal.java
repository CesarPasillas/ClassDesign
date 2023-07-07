package com.inheritance.intialization;

public class Animal {

    static {
        System.out.println("A");
    }

    {
        System.out.println("Before create the Animal class");
    }

    Animal(){
        System.out.println("After create the Animal class");
    }
}

class Hippo extends Animal {

    Hippo(){
        super();
    }

    public static void main(String[] cesar) {
        System.out.println("C");
        new Hippo();
        //new Hippo();
        //new Hippo();
    }
    static String size;

    static {
        System.out.println("B");
        System.out.println(size);
    }


    {
        size = "Big";
        System.out.println(size);
    }
}
