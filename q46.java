// q46: Constructor overloading
package it201;

class Demo {
    Demo() {
        System.out.println("Default constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized constructor: " + x);
    }
}

public class q46 {
    public static void main(String[] args) {
        new Demo();
        new Demo(10);
    }
}
