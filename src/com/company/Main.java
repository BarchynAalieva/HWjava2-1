package com.company;

public class Main {

    public static void main(String[] args) {
        LivingArea forest = new LivingArea("Forest");
        Predator predator = new Predator(10,Color.Green, forest,"Tiger");
        System.out.println(predator.getName() +" " + predator.getWeight() + " " + predator.getColor()
                + " " + predator.getArea().getName());

        LivingArea home = new LivingArea("MyHome");


        Dog dog = new Dog(5, Color.Yellow, home, "Bobik");
        System.out.println(dog.getName() + " " + dog.getWeight() + " " + dog.getColor()
                + " " + dog.getArea().getName());
        dog.makeVoice(dog);

        Cat cat = new Cat(4, Color.Pink, home,"Murka");
        System.out.println(cat.getName() +" " + cat.getWeight() + " " + cat.getColor()
                + " " + cat.getArea().getName());

        cat.makeVoice(cat);


    }

}
