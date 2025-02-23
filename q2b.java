package it201;

public class q2b {
    public static class Animal {
        public void eat() {
            System.out.println("This animal eats food.");
        }
    }

    public static class Mammal extends Animal {
        public void walk() {
            System.out.println("This mammal walks.");
        }
    }

    public static class Dog extends Mammal {
        public void bark() {
            System.out.println("The dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
