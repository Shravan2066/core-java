package com.xworkz.runTimePolymorphism;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); 
        animal2.makeSound(); 
    }
}

