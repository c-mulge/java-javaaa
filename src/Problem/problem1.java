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
        for (int j : a) {
            if (j == num) {
                isfound = true;
                break;
            }
        }
        if(isfound) System.out.println("Number: "+num+" is found");
        else System.out.println("Number: "+num+" is not found");

        System.out.println("Now let's do convert lowercase to uppercase");
        System.out.print("Enter a string: ");
        String str=sc.next();
        System.out.println("String to lowercase: "+str.toLowerCase());
        System.out.println("String to uppercase: "+str.toUpperCase());

        System.out.println("Now let's compare strings: ");
        System.out.print("Enter one more string: ");
        String str2=sc.next();
        boolean flag2=str.equals(str2);
        if(flag2) System.out.println("Are equal");
        else System.out.println("Are not equal");

        sc.close();

    }
}
