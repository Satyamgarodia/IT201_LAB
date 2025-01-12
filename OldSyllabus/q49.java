// q49: Use of super keyword
<<<<<<< HEAD:OldSyllabus/q49.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q49.java

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child class");
    }
}

public class q49 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
