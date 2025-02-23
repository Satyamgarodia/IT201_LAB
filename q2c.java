package it201;

public class q2c {
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

    public static class Cat extends Animal {
        public void meow() {
            System.out.println("The cat meows.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
