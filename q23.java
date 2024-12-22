package it201;

class BaseClass {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class DerivedClass extends BaseClass {
    // Cannot override final method
}

public class q23 {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display();
    }
}
