// q57: Use yield() function with threads
<<<<<<< HEAD:OldSyllabus/q57.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q57.java

class MyYieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " executing");
            Thread.yield();
        }
    }
}

public class q57 {
    public static void main(String[] args) {
        MyYieldThread t1 = new MyYieldThread();
        MyYieldThread t2 = new MyYieldThread();
        t1.start();
        t2.start();
    }
}
