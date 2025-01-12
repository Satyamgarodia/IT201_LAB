package riyab;

public class q16 {
    public static abstract class Animal {
        public abstract void eat();

        public void displayInfo() {
            System.out.println("This is an animal.");
        }
    }

    public static class Mammal extends Animal {
        @Override
        public void eat() {
            System.out.println("This mammal eats food.");
        }

        public void walk() {
            System.out.println("This mammal walks.");
        }
    }

    public static class Dog extends Mammal {
        @Override
        public void eat() {
            System.out.println("The dog eats dog food.");
        }

        public void bark() {
            System.out.println("The dog barks.");
        }
    }

    public static class Cat extends Mammal {
        @Override
        public void eat() {
            System.out.println("The cat eats cat food.");
        }

        public void meow() {
            System.out.println("The cat meows.");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println("Dog:");
        dog.displayInfo();
        dog.eat();
        if (dog instanceof Mammal) {
            ((Mammal) dog).walk();
        }
        if (dog instanceof Dog) {
            ((Dog) dog).bark();
        }

        Animal cat = new Cat();
        System.out.println("\nCat:");
        cat.displayInfo();
        cat.eat();
        if (cat instanceof Mammal) {
            ((Mammal) cat).walk();
        }
        if (cat instanceof Cat) {
            ((Cat) cat).meow();
        }
    }
}