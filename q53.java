// q53: Create thread by implementing Runnable interface
package it201;

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
