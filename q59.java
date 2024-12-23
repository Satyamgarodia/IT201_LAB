// q59: Use join() function with threads
package it201;

class MyJoinThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " executing");
        }
    }
}

public class q59 {
    public static void main(String[] args) {
        MyJoinThread t1 = new MyJoinThread();
        MyJoinThread t2 = new MyJoinThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        t2.start();
    }
}
