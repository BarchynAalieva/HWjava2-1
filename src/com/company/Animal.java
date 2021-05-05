package com.company;

public class Animal {
    private int weight;
    private Color color;
    private LivingArea area;

    public Animal() {
    }

    public Animal(int weight, Color color, LivingArea area) {
        this.weight = weight;
        this.color = color;
        this.area = area;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public LivingArea getArea() {
        return area;
    }
}
