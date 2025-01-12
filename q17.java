package riyab;

public class q17 {
    public static abstract class Animal {
        public void eat() {
            System.out.println("This animal eats food.");
        }

        public abstract void makeSound();
    }

    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows.");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

        Animal cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
}