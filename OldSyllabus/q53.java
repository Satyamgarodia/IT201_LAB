// q53: Create thread by implementing Runnable interface
<<<<<<< HEAD:OldSyllabus/q53.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q53.java

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class q53 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
