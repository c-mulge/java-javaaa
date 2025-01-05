package MultiThreading;// Running the Threads in Java

import java.io.*;
import java.util.*;

// Method 1 - Thread Class
class ThreadImpl extends Thread
{
    // Method to start Thread
    @Override
    public void run()
    {
        String str = "Extend";
        System.out.println(str);
    }
}

// Method 2 - Runnable Interface
class RunnableThread implements Runnable
{
    // Method to start Thread
    @Override
    public void run()
    {
        String str = "Implement";
        System.out.println(str);
    }

}

public class t4
{
    public static void main(String[] args)
    {

        // Method 2 - Runnable Interface
        RunnableThread g2 = new RunnableThread();
        Thread t2 = new Thread(g2);
        t2.start();

        // Method 1 - Thread Class
        ThreadImpl t1 = new ThreadImpl();
        t1.start();

    }
}