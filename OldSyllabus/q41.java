// q41: Runtime polymorphism
package riyab;
// take user input if required

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class");
    }
}

public class q41 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
