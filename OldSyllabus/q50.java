// q50: Constructor chaining using 'this'
package OldSyllabus;

class Demo {
    Demo() {
        this(10);
        System.out.println("Default constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized constructor: " + x);
    }
}

public class q50 {
    public static void main(String[] args) {
        new Demo();
    }
}
