package riyab;

class BaseClass {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class DerivedClass extends BaseClass {
    void displayDerived() {
        System.out.println("This is a method in the derived class.");
        display();
    }
}

public class q4b {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.displayDerived();
    }
}