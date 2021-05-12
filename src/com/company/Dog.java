package com.company;

public class Dog extends Predator {


    public Dog(int weight, Color color, LivingArea area, String name) {
        super(weight, color, area, name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is dog");
    }
}
