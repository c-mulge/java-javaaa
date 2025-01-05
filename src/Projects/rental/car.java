package Projects.rental;
import java.util.Scanner;

public class car {
    private String admin_id;
    private String admin_password;
    private String user_id;
    private String user_password;

    public car(){
        this.admin_id="";
        this.admin_password="";
        this.user_id="";
        this.user_password="";
    }
    public void admin_login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter login id: ");
        admin_id=sc.next();
        System.out.println("Enter password: ");
        admin_password=sc.next();
    }

    public void admin_verify(){
        if(admin_id.equals("ADMIN") && admin_password.equals("ADMIN")){
            admin a= new admin();
        } else if (admin_id.equals("ADMIN")){
            System.out.println("Password Incorrect!!!");
        } else if (admin_password.equals("ADMIN")) {
            System.out.println("Admin Id Incorrect!!!");
        }else{
            System.out.println("Admin Id and Password Incorrect!!!");
        }
    }

    public void user_login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login id: ");
        user_id=sc.next();
        System.out.println("Enter password: ");
        user_password=sc.next();
//        System.out.println();
//        System.out.println("New Registration?");
    }

    public void user_verify(){
        if(user_id.equals("Soham") && user_password.equals("Soham@123")){
            user u= new user();
        } else if (user_id.equals("Soham")){
            System.out.println("Password Incorrect!!!");
        } else if (user_password.equals("Soham@123")) {
            System.out.println("User Id Incorrect!!!");
        }else{
            System.out.println("User Id and Password Incorrect!!!");
        }
    }

    public void user_profile(){
        System.out.println("User name: "+user_id);

    }
}
