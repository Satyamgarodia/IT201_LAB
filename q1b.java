package riyab;

public class q1b {
    public static class Parent {
        public void display() {
            System.out.println("This is the parent class.");
        }
    }

    public static class Child extends Parent {
        @Override
        public void display() {
            super.display();
            System.out.println("This is the child class.");
        }
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
        Parent obj1 = new Parent();
        obj1.display();
    }
}