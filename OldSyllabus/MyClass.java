// q44: Own package and import
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass");
    }
}

// Another package
package OldSyllabus;

import mypackage.MyClass;

public class q44 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
