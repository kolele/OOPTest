package com.kole;

public class Main {

    public static void main(String[] args) {
        Burger kobasBurger = new Burger("KobasBurger", "Somerolldawg");
        kobasBurger.addCarrot();
        kobasBurger.showTotalPrice();

        System.out.println("**********************************************************************");

        HealthyBurger healthy = new HealthyBurger("Healthy","Brown rye roll");
        healthy.addCarrot();
        healthy.addLettuce();
        healthy.addTomato();
        healthy.addVodka();
        healthy.addFifthAddtion();
        healthy.addSixthAddtion();
        healthy.showTotalPrice();

        System.out.println("**************************************************************************");
        DeluxeHamburger deluxe = new DeluxeHamburger("Deluxe", "Deluxeroll");
        deluxe.addCarrot();
        deluxe.coke();
        deluxe.chips();
        deluxe.showTotalPrice();
    }
}
