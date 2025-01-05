package MultiThreading;
import java.lang.*;

// Define a class that extends Thread to create a custom thread
class demoClass extends Thread {
    // Override the run method to define the code that will be executed by the thread
    public void run() {
        // Print the ID of the current thread
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class t3 {
    public static void main(String[] args) {
        // Define the number of threads to be created
        int n = 8;
        // Create and start 'n' threads
        for (int i = 0; i < n; i++) {
            // Create a new instance of demoClass
            demoClass d = new demoClass();
            // Start the thread, which will call the run method of demoClass
            d.start();
        }
    }
}
