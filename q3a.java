package riyab;

// take user input if required

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MultipleInheritanceClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method from Interface1");
    }

    public void method2() {
        System.out.println("Method from Interface2");
    }
}

public class q3a {
    public static void main(String[] args) {
        MultipleInheritanceClass obj = new MultipleInheritanceClass();
        System.out.println("Demonstrating Multiple Inheritance:");
        obj.method1();
        obj.method2();
    }
}