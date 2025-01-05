package Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
//        prints in reverse order
        pq.offer(16);
        pq.offer(12);
        pq.offer(21);
        pq.offer(13);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
