package com.company;

public class Shark extends Animal {
    public Shark(String name, int age, String colour) {
        super(name, age, colour);
    }

    void attack() {
        System.out.println(getName() + " is attack");
    }
}
