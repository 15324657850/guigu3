package com.example.ping;

public class Simulator {
    public void playSound(Animal animal) {
//        if (animal instanceof Dog) {
//            Dog dog = (Dog) animal;
//            dog.cry();
//            dog.getAnimalName();
//        } else if (animal instanceof Cat) {
//            Cat cat = (Cat) animal;
//            cat.cry();
//        }
        animal.cry();
        System.out.println(animal.getAnimalName());

    }
}