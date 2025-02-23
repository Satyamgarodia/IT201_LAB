package it201;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C {
    void methodC() {
        System.out.println("Method from class C");
    }
}

class D extends C implements A, B {
    public void methodA() {
        System.out.println("Method from interface A");
    }

    public void methodB() {
        System.out.println("Method from interface B");
    }
}

public class q2d {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
