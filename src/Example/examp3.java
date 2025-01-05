package Example;
import java.util.*;

public class examp3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n=sc.nextInt();
        int coe=1;
        int i,j;
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                if(j==0||i==0){
                    coe=1;
                }else{
                    coe=coe*(i-j+1)/j;
                }
                System.out.print(coe+" ");
            }
        }
        sc.close();
    }
}
