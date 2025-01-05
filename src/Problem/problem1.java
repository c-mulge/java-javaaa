package Problem;
import java.util.*;

public class problem1 {

    public static void main(String[] args){
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter number to be searched: ");
        int num=sc.nextInt();
        boolean isfound=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                isfound=true;
                break;
            }
        }
        if(isfound==true) System.out.println("Number: "+num+" is found");
        else System.out.println("Number: "+num+" is not found");

        System.out.println("Now let's do convert lowercase to uppercase");
        System.out.print("Enter a string: ");
        String str=sc.next();
        System.out.println("String to lowercase: "+str.toLowerCase());
        System.out.println("String to uppercase: "+str.toUpperCase());

        sc.close();

    }
}
