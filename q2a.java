package it201;

public class q2a {
    public static class Animal {
        public void eat() {
            System.out.println("This animal eats food.");
        }
    }

    public static class Dog extends Animal {
        public void bark() {
            System.out.println("The dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
