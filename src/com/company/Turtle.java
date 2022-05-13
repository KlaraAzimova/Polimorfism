package com.company;

public class Turtle extends Animal {
    public Turtle(String name, int age, String colour) {
        super(name, age, colour);
    }

    public void swim() {
        System.out.println(getName() + " is swimming");

    }
}
