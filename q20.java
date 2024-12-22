package it201;

interface ParentInterface1 {
    void parentMethod1();
}

interface ParentInterface2 {
    void parentMethod2();
}

interface ChildInterface extends ParentInterface1, ParentInterface2 {
    void childMethod();
}

class MultiInheritanceClass implements ChildInterface {
    public void parentMethod1() {
        System.out.println("Method from ParentInterface1");
    }

    public void parentMethod2() {
        System.out.println("Method from ParentInterface2");
    }

    public void childMethod() {
        System.out.println("Method from ChildInterface");
    }
}

public class q20 {
    public static void main(String[] args) {
        MultiInheritanceClass obj = new MultiInheritanceClass();
        obj.parentMethod1();
        obj.parentMethod2();
        obj.childMethod();
    }
}
