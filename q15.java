package riyab;

public class q15 {
    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(this.name + " eats food.");
        }

        public void displayInfo() {
            System.out.println("This is an animal.");
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        public void bark() {
            System.out.println("The dog barks.");
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("This is a dog.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();
        dog.displayInfo();
    }
}