// q52: Create thread by extending Thread class
<<<<<<< HEAD:OldSyllabus/q52.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q52.java

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class q52 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
