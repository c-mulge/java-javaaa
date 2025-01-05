package Projects.rental;

import java.util.Scanner;

public class web {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CaRental");
        System.out.println();
        System.out.println("Admin or User");
        String choice = sc.next();
        choice=choice.toLowerCase();
        car c = new car();
        if(choice.equals("admin")){
            c.admin_login();
            c.admin_verify();
        } else if (choice.equals("user")) {
            c.user_login();
            c.user_verify();
        }else{
            System.out.println("Select correctly");
        }
    }
}
