package riyab;

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
    @Override
    public void methodA() {
        System.out.println("Method from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method from interface B");
    }
}

public class q2d {
    public static void main(String[] args) {
        D obj = new D();
        System.out.println("Methods from class D:");
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}