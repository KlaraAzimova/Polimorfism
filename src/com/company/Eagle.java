package com.company;

public class Eagle extends Animal {
    public Eagle(String name, int age, String colour) {
        super(name, age, colour);
    }

    void fly() {
        System.out.println(getName() + " is flying");
    }
}
