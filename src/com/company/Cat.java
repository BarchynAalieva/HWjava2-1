package com.company;

public final class Cat extends Predator {


    public Cat(int weight, Color color, LivingArea area, String name) {
        super(weight, color, area, name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is cat");
    }
}
