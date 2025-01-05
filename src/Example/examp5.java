package Example;

import java.io.*;
import java.util.*;

public class examp5{

    public static void copyfile(String src,String dest){
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try{
            fis=new FileInputStream(src);
            fos=new FileOutputStream(dest);
            int bytedata;
            while((bytedata=fis.read())!=-1){
                fos.write(bytedata);
            }
            System.out.println("File copied");
        }catch(Exception e){
            System.out.println("Error");
        }finally {
            try{
                if(fis!=null){
                    fis.close();
                }if(fos!=null){
                    fos.close();
                }
            }catch(Exception e){
                System.out.println("error");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter src file: ");
        String src=sc.next();
        System.out.println("Enter dest file: ");
        String dest=sc.next();
        copyfile(src,dest);
    }
}