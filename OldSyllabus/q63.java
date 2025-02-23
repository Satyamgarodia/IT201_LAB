package OldSyllabus;

public class q63 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads
        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);
        Thread thread3 = new CounterThread(counter);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    // Method to increment the counter using a synchronized block
    public void increment() {
        // Synchronized block to control access to the critical section
        synchronized (this) {
            count++;
        }
    }

    // Method to get the current count
    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}