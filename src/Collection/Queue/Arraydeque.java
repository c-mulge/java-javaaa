package Collection.Queue;
import java.util.*;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> aq =new ArrayDeque<>();
        aq.offer(1);
        aq.offer(2);
        aq.offerFirst(0);
        aq.offerLast(3);
        System.out.println(aq);
        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());
    }
}
