package com.kole;

public class HealthyBurger extends Burger{
    public HealthyBurger(String name, String breadRollType) {
        super(name, breadRollType);
    }

    double fifthAddition = 0.7;
    double sixthAddtion = 0.9;

    public void addFifthAddtion(){
        System.out.println("Fifth Addtion added for " + fifthAddition);
        additionsTotalPrice += fifthAddition;
    }

    public void addSixthAddtion(){
        System.out.println("Sixth Addtion added for " + sixthAddtion);
        additionsTotalPrice += sixthAddtion;
    }


}
