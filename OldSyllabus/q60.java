// q60: Create multiple threads that perform different tasks
package OldSyllabus;

class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 is running.");
    }
}

class Task2 extends Thread {
    public void run() {
        System.out.println("Task2 is running.");
    }
}

class Task3 extends Thread {
    public void run() {
        System.out.println("Task3 is running.");
    }
}

public class q60 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        t1.start();
        t2.start();
        t3.start();
    }
}
