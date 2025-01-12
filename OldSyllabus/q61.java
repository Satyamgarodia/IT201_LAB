// q61: Prioritize threads
<<<<<<< HEAD:OldSyllabus/q61.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q61.java

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " with priority "
                    + Thread.currentThread().getPriority() + " is running.");
        }
    }
}

public class q61 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread 1");
        PriorityThread t2 = new PriorityThread("Thread 2");
        PriorityThread t3 = new PriorityThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}
