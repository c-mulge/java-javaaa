package Collection.Hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
//        Set<Integer> s=new LinkedHashSet<>();  //stores in linked list format
//        Set<Integer> s=new TreeSet<>();    //stores in sorted format- implements binary tree
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s);
        s.remove(20); //removes element from set
        //contains always returns tru or false
        //basically it checks whether the element is in set or not
        if(s.contains(20)){
            System.out.println("20 is present");
        }else{
            System.out.println("it is not present");
        }

        System.out.println(s.isEmpty());
//        s.isEmpty();   //checks if the set is empty or not- true or false
        System.out.println("Size: "+s.size());  //returns the size of the set
//        s.clear();  //removes all elements from the set
    }
}
