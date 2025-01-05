package Example;
import java.util.*;

public class examp3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n=sc.nextInt();
        int coe;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            coe=1;
            for(int j=0;j<=i;j++){
                System.out.format("%d ",coe);
                    coe=coe*(i-j)/(j+1);

            }
                System.out.println();
        }
        sc.close();
    }
}
