package com.company;

public class Main {

    public static void main(String[] args) {

        Animal shark = new Shark("Shark", 5, "blue");
        Animal eagle = new Eagle("Eagle", 6, "black");
        Animal turtle = new Turtle("Turtle", 12, "brown");
        Animal[] animals = {turtle, eagle, shark};


        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            }
            if (a.getClass().getName().equals("homework15.Shark")) {
                ((Shark) a).attack();
            }

            if (a instanceof Turtle) {
                ((Turtle) a).swim();
            }
            if (a.getClass().getName().equals("homework15.Turtle")) {
                ((Turtle) a).swim();
            }
            if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }
            if (a.getClass().getName().equals("homework15.Eagle")) {
                ((Eagle) a).fly();
            }
            System.out.println(a);
        }
    }


}
