package com.rawnak;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // We can keep sub class object's reference in super class variable
        Animal a = new Animal();
        Animal h = new Herbivores(); //upcasting
        Animal o = new Omnivores(); //upcasting
        Animal c = new Carnivores(); //upcasting

        a.eat();
        h.eat();
        o.eat();
        c.eat();
    }
}
