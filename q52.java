// q52: Create thread by extending Thread class
package riyab;
// take user input if required

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
