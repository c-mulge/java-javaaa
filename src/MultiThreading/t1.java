package MultiThreading;

public class t1 {
    public static void main(String[] args){
//        System.out.println("Hello World");
//        System.out.println(Thread.currentThread().getName());


        // Create an instance of the t2 class which implements Runnable
        t2 t = new t2();
//        t.start(); //only works when t2 extends Thread

        // Create a new Thread object, passing the t2 instance to the Thread constructor
        Thread t1 = new Thread(t);   //passing obj of t2 to Thread class

        // Start the thread, which will call the run method of the t2 instance
        t1.start();

        // Print the name of the current thread (main thread)
        System.out.println(Thread.currentThread().getName());
    }
}
