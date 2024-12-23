// q58: Use sleep() function with threads
package it201;

class MySleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class q58 {
    public static void main(String[] args) {
        MySleepThread t = new MySleepThread();
        t.start();
    }
}
