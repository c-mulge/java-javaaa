package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylsit {
    public static void main(String[] args) {
//        ArrayList<String> s=new ArrayList<>();  //arraylist
//        s.add("Siddhesh");
//        s.add("Rohan");
//        s.add("Devu");
//        System.out.println(s);
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
//        System.out.println(l);
        l.add(0,0);
//        System.out.println(l);

        List<Integer> newList =new ArrayList<>();
        newList.add(150);
        newList.add(160);
//        newList.addAll(l);
//        System.out.println(l);

        l.addAll(newList);  //adds all elements of newList to l
//        System.out.println(l.get(1));  //returns the element at index 1

        l.remove(1);  //deletes the element at index 1
//        System.out.println(l);

        l.remove(Integer.valueOf(150)); //delets the elemnent 150
//        System.out.println(l);

//        l.clear();  //removes all the contents of list
        l.set(2,1000);  //replaces the element at index 2 with 1000
//        System.out.println(l.contains(50));  //returns true if element is present in the list else false
//        System.out.println(l);

        for (int i = 0; i < l.size(); i++) {
//            System.out.println("Element: "+l.get(i));
        }
        Iterator<Integer> i=l.iterator();
        while(i.hasNext()){
            System.out.println("Iterator: "+i.next());
        }
    }
}
