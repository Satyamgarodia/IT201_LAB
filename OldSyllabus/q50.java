// q50: Constructor chaining using 'this'
<<<<<<< HEAD:OldSyllabus/q50.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q50.java

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
