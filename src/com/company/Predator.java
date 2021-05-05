package com.company;

public class Predator extends Animal {
    public void printInfo() {
        System.out.println("Animal\nweight-" + super.getWeight() + "\ncolor-" + super.getColor() + "\n livingArea-" + super.getArea());
    }
}

