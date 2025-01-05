package MultiThreading;
import java.lang.*;

//public class t2 extends Thread{
//    @Override
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Hello World");
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//}

public class t2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

