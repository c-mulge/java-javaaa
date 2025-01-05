package MultiThreading;

// Define a class MyThread that extends the Thread class
class MyThread extends Thread {
    // Override the run method to define the code that will be executed by the thread
    public void run() {
        // Print a message indicating the thread has started running
        System.out.println("Thread is running --start");
        // Print the name of the current thread
        System.out.println(Thread.currentThread().getName());
        // Print a message indicating the thread is still running
        System.out.println("Thread is running --end");

        try {
            // Make the current thread sleep for 2000 milliseconds (2 seconds)
            Thread.sleep(2000);
            // Print a message indicating the wait is over
            System.out.println("Wait is over");
        } catch (InterruptedException e) {
            // If the thread is interrupted while sleeping, throw a RuntimeException
            throw new RuntimeException(e);
        }

        // The following lines are commented out, but they would print the current thread's name and state
        // System.out.println("----------------");
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getState());
        // System.out.println("--------------------");
    }
}

// Define the main class t5
public class t5 {
    // The main method, which is the entry point of the program
    public static void main(String[] args) throws InterruptedException {
        // Create an instance of MyThread
        MyThread t1 = new MyThread();
        // Print the initial state of the thread (NEW)
        System.out.println(t1.getState());
        // Start the thread, which will call the run method of MyThread
        t1.start();
        // Print the state of the thread after calling start (RUNNABLE)
        System.out.println(t1.getState());
        // Make the main thread sleep for 200 milliseconds
        Thread.sleep(200);
        // Print the state of the thread after the main thread wakes up
        System.out.println("Final state: " + t1.getState());
        // Print whether the thread is alive (true if it is still running)
        System.out.println(t1.isAlive());
        // Wait for the thread t1 to die
        t1.join();
        // Print whether the thread is alive (false since it has finished running)
        System.out.println(t1.isAlive());
        // Print the final state of the thread (TERMINATED)
        System.out.println(t1.getState());

        // The following lines are commented out, but they would print the main thread's name and state
        // System.out.println("----------------");
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getState());
        // System.out.println("--------------------");
    }
}