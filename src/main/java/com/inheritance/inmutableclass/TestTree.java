package com.inheritance.inmutableclass;

public class TestTree {

    public static void main(String[] args) {
        Fruit fruit =  Fruit.getInstance("Cherry", "Black red");
        Tree tree = Tree.getInstance("Cherry Tree", fruit);

        System.out.println(tree.getFruit().getName());
        System.out.println(tree.getFruit().getColor());
        System.out.println(tree.getName());
        System.out.println("==========");


        System.out.println(tree.getFruit().getName());
        System.out.println(tree.getFruit().getColor());
        System.out.println(tree.getName());
    }
}
