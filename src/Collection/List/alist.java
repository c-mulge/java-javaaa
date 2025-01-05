package Collection.List;

import java.util.ArrayList;

public class alist {
    public static void main(String[]args){
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("Initial size of al: "+al.size());
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Size of al after: "+al.size());
        System.out.println("Al: "+al);
        System.out.println("Contains: "+al.contains(3));
        System.out.println(al.get(2));  //returns element at index 2
        System.out.println("Index of: "+al.indexOf(2));  //returns index of element


//        al.remove(Integer.valueOf(1));
        al.remove(1);
        al.remove(2);
        System.out.println("After deletion size: "+al.size());
        System.out.println("Al: "+al);
    }
}
