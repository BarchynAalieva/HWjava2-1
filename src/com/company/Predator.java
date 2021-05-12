package com.company;

import java.sql.SQLOutput;

public class Predator extends Animal {
    private String name;

    public Predator(int weight, Color color, LivingArea area, String name) {
        super(weight, color, area);
        this.name = name;
    }


    public String getName() {
        return name;

    }

    public void printInfo() {
        System.out.println("Animal\nweight-" + super.getWeight() + "\ncolor-" + super.getColor() + "\n livingArea-" + super.getArea());
    }

    public void makeVoice( Cat cat){
        System.out.println("мяу" + cat.getName());

    }

    public void makeVoice(Dog dog){
        System.out.println("Гав" + dog.getName());

    }

}

