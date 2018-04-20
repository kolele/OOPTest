package com.kole;

public class Main {

    public static void main(String[] args) {
        Burger kobasBurger = new Burger("KobasBurger", "Somerolldawg");
        kobasBurger.addCarrot();
        kobasBurger.showTotalPrice();

        HealthyBurger healthy = new HealthyBurger("Healthy","Brown rye roll");
        healthy.addCarrot();
        healthy.addLettuce();
        healthy.addTomato();
        healthy.addVodka();
        healthy.addFifthAddtion();
        healthy.addSixthAddtion();
        healthy.showTotalPrice();
    }
}
