package Projects.emailapp;

import java.util.Scanner;

public class emailapp {
    public static void main(String[] args) {
        String firstname;
        String lastname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstname=sc.next();
        System.out.println("Enter your last name: ");
        lastname=sc.next();
        email em1=new email(firstname,lastname);
//        em1.setMailboxcapacity();
//        em1.changepassword();
//        em1.setAlternateemail("js@gmail.com");
//        System.out.println(em1.getAlternateemail());
        System.out.println("*****************************************");
        System.out.println("\nYour Info");
        System.out.println(em1.showinfo());

    }
}
