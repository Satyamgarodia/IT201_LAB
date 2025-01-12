// q48: Copy constructor effect without constructors
<<<<<<< HEAD:OldSyllabus/q48.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q48.java

class Demo {
    int x;
}

public class q48 {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.x = 10;
        Demo obj2 = new Demo();
        obj2.x = obj1.x;
        System.out.println(obj2.x);
    }
}
