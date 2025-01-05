package Swing;

import java.util.*;
import java.text.SimpleDateFormat;

class MyNumber{
    private int one;
    MyNumber(){
        this.one=0;
    }
    MyNumber(int o){
        this.one=o;
    }
    public boolean isNegative(){
        return this.one<0;
    }

    public boolean isPositive(){
        return this.one>0;
    }

    public boolean isZero(){
        return this.one==0;
    }
    public boolean isOdd(){
        return this.one%2!=0;
    }
    public boolean isEven(){
        return this.one%2==0;
    }
}

class Student{
    public int rno;
    public String name;
    public double per;
    public static int obj=0;
    public Student(){
        this.rno=0;
        this.name="";
        this.per=0;
        obj++;
    }
    public Student(int r,String n,double p){
        this.rno=r;
        this.name=n;
        this.per=p;
        obj++;
    }
    public static int getobj(){
        return obj;
    }
    public void display(){
        System.out.println("Roll no: "+rno);
        System.out.println("Name: "+name);
        System.out.println("Percentage: "+per+"%");
    }
}

public class MyFrame4{
    public static void main(String[] args){
//        Date d=new Date();
//        SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("Current date: "+f1.format(d));
//        SimpleDateFormat f2=new SimpleDateFormat("MM/dd/yyyy");
//        System.out.println("Current date: "+f2.format(d));
//        SimpleDateFormat f3=new SimpleDateFormat("EEEE MMMM dd yyyy");
//        System.out.println("Current date: "+f3.format(d));
//        SimpleDateFormat f4=new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
//        System.out.println("Current Date: "+f4.format(d));
//        SimpleDateFormat f5=new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
//        System.out.println("Current Date: "+f5.format(d));
//        SimpleDateFormat f6=new SimpleDateFormat("HH:mm:ss");
//        System.out.println("Current Date: "+f6.format(d));
//if(args.length<1){
//    System.out.println("provide path");
//    return;
//}
//
//int value=Integer.parseInt(args[0]);
//MyNumber m=new MyNumber(value);
//        System.out.println("Is negative: "+m.isNegative());
//        System.out.println("Is positive: "+m.isPositive());
//        System.out.println("Is zero: "+m.isZero());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n=sc.nextInt();
        Student[] std=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of student "+(i+1)+":");
            System.out.println("Roll no: ");
            int r=sc.nextInt();
            System.out.println("Name: ");
            String name=sc.next();
            System.out.println("Percentage: ");
            double p=sc.nextDouble();
            std[i]=new Student(r,name,p);
            System.out.println("Total obj: "+Student.getobj());
        }
        System.out.println("Display: ");
        for(Student student: std){
            student.display();
            System.out.println();
        }
        sc.close();

    }
}