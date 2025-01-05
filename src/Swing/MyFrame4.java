package Swing;

//import java.util.*;
import java.io.*;

public class MyFrame4{
    public static void main(String[] args){
        String path=args[0];
        File file=new File(path);
        if(!file.exists()){
            System.out.println("Does not exists");
            return;
        }
        if(file.isFile()){
            System.out.println("This is file");
            System.out.println("Path: "+file.getAbsolutePath());
            System.out.println("Size: "+file.length());
            System.out.println("Readable: "+file.canRead());
            System.out.println("Write: "+file.canWrite());
            System.out.println("Executable: "+file.canExecute());
            System.out.println("Last Modified: "+file.lastModified());
        }else if(file.isDirectory()){
            System.out.println("This is Directory");
            File[] contents=file.listFiles();
            if(contents==null||contents.length==0){
                System.out.println("Directory is empty");
                return;
            }
            System.out.println("Contents: ");
            int filecount=0;
            for(File f: contents){
                System.out.println("- "+f.getName());
                if(f.isFile()){
                    filecount++;
                }
            }
            System.out.println("Directory: "+filecount+" files");
        }else {
            System.out.println("The specified path is neither a file nor a directory.");
        }
    }
}