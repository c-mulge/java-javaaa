package Collection.List;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        System.out.println(ll.offer(5)); //return true and appends to linked list
        ll.addFirst(0);
        ll.addLast(6);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

        System.out.println("Get first: "+ll.getFirst());
        System.out.println("Get last: "+ll.getLast());
        System.out.println(ll.indexOf(4));
        System.out.println(ll.indexOf(1));


    }
}
