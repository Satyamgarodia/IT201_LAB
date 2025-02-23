package OldSyllabus;

class q64 {
    public static void main(String[] args) {
        // Create a thread that runs a task
        TaskThread taskThread = new TaskThread();
        taskThread.start();

        // Let the task run for a while
        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the task thread
        System.out.println("Main thread is interrupting the task thread.");
        taskThread.interrupt();
    }
}

class TaskThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Task thread is running...");
            for (int i = 0; i < 10; i++) {
                // Simulate some work
                Thread.sleep(500); // Sleep for 500 milliseconds
                System.out.println("Task thread is working: " + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("Task thread was interrupted!");
            return; // Exit the run method
        }
        System.out.println("Task thread completed its work.");
    }
}