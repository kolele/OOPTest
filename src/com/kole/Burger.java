package com.kole;

public class Burger {
    private String name;
    private String meat;
    private String breadRollType;
    private double basePrice;

    public Burger(String name, String breadRollType) {
        this.name = name;
        this.meat = "Cat meat";
        this.breadRollType = breadRollType;
        this.basePrice = 2.2;
    }

    double additionsTotalPrice = 0;
    boolean lettuceAdded = false;
    double lettucePrice = 0.2;
    boolean tomatoAdded = false;
    double tomatoPrice = 0.4;
    boolean carrotAdded = false;
    double carrotPrice = 0.7;
    boolean vodkaAdded = false;
    double vodkaPrice = 0.7;

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addLettuce(){
        System.out.println("Lettuce added for " + lettucePrice);
        additionsTotalPrice += lettucePrice;
    }

    public void addTomato(){
        System.out.println("Tomato added for " + tomatoPrice);
        additionsTotalPrice += tomatoPrice;
    }

    public void addCarrot(){
        System.out.println("Tomato added for " + carrotPrice);
        additionsTotalPrice += carrotPrice;
    }

    public void addVodka(){
        System.out.println("Tomato added for " + vodkaPrice);
        additionsTotalPrice += vodkaPrice;
    }

    public void showTotalPrice (){
        basePrice += additionsTotalPrice;
        System.out.println("Total price of hamburger with all additions is " + basePrice);
    }
}
