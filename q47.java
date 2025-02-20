// q47: Copy constructor effect using constructors
package it201;

class Demo {
    int x;

    Demo(int x) {
        this.x = x;
    }

    Demo(Demo obj) {
        this.x = obj.x;
    }
}

public class q47 {
    public static void main(String[] args) {
        Demo obj1 = new Demo(10);
        Demo obj2 = new Demo(obj1);
        System.out.println(obj2.x);
    }
}
