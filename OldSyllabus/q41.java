// q41: Runtime polymorphism
<<<<<<< HEAD:OldSyllabus/q41.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q41.java

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class");
    }
}

public class q41 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
