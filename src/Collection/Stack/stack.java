package Collection.Stack;

import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animal= new Stack<>();
        animal.push("Lion");
        animal.push("Tiger");
        animal.push("Cat");
        animal.push("Cow");

        System.out.println(animal);
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal);

        Iterator<String> i=animal.iterator();
        while(i.hasNext()){
//            System.out.println(i.next());
        }
    }
}
