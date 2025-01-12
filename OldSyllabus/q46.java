// q46: Constructor overloading
<<<<<<< HEAD:OldSyllabus/q46.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q46.java

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
