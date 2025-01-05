package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(12);
        q.offer(24);
        q.offer(36);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

    }
}
