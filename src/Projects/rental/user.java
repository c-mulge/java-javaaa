package Projects.rental;

import java.util.Scanner;

import static java.lang.System.exit;

public class user {
//    public void user_profile();
    public user() {
//        System.out.println("User also working");
        System.out.println("1. Home\n2. Contact\n3. User Profile\n4. Check Cars\n5. Exit\nEnter your choice:");
        Scanner sc = new Scanner(System.in);
//        web w=new web();

        int ch=sc.nextInt();
        while(true) {
            switch (ch) {
                case 1: //w.main();
                    System.out.println("Directing to home page");
                    break;
                case 2:
                    System.out.println("Directing to contact page");
                    break;
                case 3:
                    System.out.println("Directing to user profile page");
//                car c= new car();
                    user_profile();
                    break;

                case 4:
//                System.out.println();
                    available_cars();
                    break;
                case 5:
                    exit(0);
                    break;
            }
        }
    }
    public String user_name="Soham";
    public String user_surname="Shirke";
    public String user_id="Soham";
    public String user_password="Soham@123";
    public String user_age="20";
    public String user_doc="Doc";

    public void user_profile(){
        System.out.println("User name: "+user_name+" "+user_surname);
        System.out.println("User id: "+user_id);
        System.out.println("User_Password: "+user_password);
        System.out.println("User Age: "+user_age);
        System.out.println("User Documnet: "+user_doc);
    }

    public void available_cars(){
        car_details car_d=new car_details();
        System.out.println("Available Cars: ");
        System.out.println();
        System.out.println("1. BMW\n2. Swift\n3. Ciaz\n4. Dzire\n5. Accent\n6. Exit");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        while(true) {
            switch (choice) {
                case 1:
                    car_d.car_1();
                    break;
                case 2:
                    car_d.car_2();
                    break;
                case 3:
                    car_d.car_3();
                    break;
                case 4:
                    car_d.car_4();
                    break;
                case 5:
                    car_d.car_5();
                    break;
                case 6:
                    exit(0);
                    break;
            }
        }
    }
}
