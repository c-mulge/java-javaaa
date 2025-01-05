package Projects.emailapp;

import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxcapacity=500;
    private int passwordlength=10;
    private String e;
    private String alternateemail;
    private String companysuffix="company.com";

    //constructor
    public email(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Email created: "+this.firstname+" "+this.lastname);

        //call a method for department
        this.department=setdepartment();
        System.out.println("Department: "+this.department);

        //call a method for password
        this.password=randompassword(passwordlength);
        System.out.println("Password: "+this.password);

        //combine element to generate email
        e=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix;
        System.out.println(e);
    }
    //ask department
    private String setdepartment(){
        System.out.print("Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner sc = new Scanner(System.in);
        int depchoice=sc.nextInt();

        if(depchoice==1)return "Sales";
        else if (depchoice==2)return "Development";
        else if (depchoice==3)return "Accounting";
        else return "";

    }
    //generate random password
    private String randompassword(int length){
        String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$&";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand= (int) (Math.random()*passwordset.length());
            password[i]=passwordset.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxcapacity(int capacity){
        this.mailboxcapacity=capacity;
    }
    //set alternate email
    public void setAlternateemail(String altemail){
        this.alternateemail=altemail;
    }
    //change password
    public void changepassword(String password){
        this.password=password;
    }

    public int getMailboxcapacity(){return mailboxcapacity;}
    public String getAlternateemail(){return alternateemail;}
    public String getPassword(){return password;}

    public String showinfo(){
        return "Name: "+firstname+" "+lastname+
                "\nCompany Email: "+e+
                "\nMailbox Capacity: "+mailboxcapacity;
    }

}
