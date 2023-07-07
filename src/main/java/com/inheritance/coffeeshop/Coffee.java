package com.inheritance.coffeeshop;

public class Coffee extends Object {

    String flavor;
    private boolean isHot;
    protected boolean withSugar;
    public String size;

    public void makeCoffe(){
        System.out.println("Making Coffe..");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isWithSugar() {
        return withSugar;
    }

    public void setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}