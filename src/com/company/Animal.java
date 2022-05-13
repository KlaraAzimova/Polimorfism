package com.company;

public class Animal {
    private String name;
    private int age;
    private String colour;


    public Animal(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void speed(int a) {
        System.out.println(name + " can run with the speed of " + a + " km/h");
    }


    @Override
    public String toString() {
        return "Animal: " +
                "name - " + name +
                ", age - " + age +
                ", colour - " + colour;

    }
}
