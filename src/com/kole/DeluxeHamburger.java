package com.kole;

public class DeluxeHamburger extends Burger{
    public DeluxeHamburger(String name, String breadRollType) {
        super(name, breadRollType);
    }

    double chips = 1.1;
    double coke = 1.4;

    @Override
    public void addLettuce() {
        System.out.println("Cannot add");
    }

    @Override
    public void addTomato() {
        System.out.println("Cannot add");
    }

    @Override
    public void addCarrot() {
        System.out.println("Cannot add");
    }

    @Override
    public void addVodka() {
        System.out.println("Cannot add");
    }

    public void chips(){
        System.out.println("chips added for " + chips);
        additionsTotalPrice += chips;
    }

    public void coke(){
        System.out.println("coke added for " + coke);
        additionsTotalPrice += coke;
    }
}
