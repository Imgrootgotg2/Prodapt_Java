package Assignment3;

import java.io.*;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] argv) throws Exception
    {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name of the directory");
       String path = sc.nextLine();
       System.out.println("File name");
       String filename = sc.nextLine();
       File file = new File(path);
       int k=0;
       if(file.isDirectory());
       File []files=file.listFiles();
       for(File file1:files) {
    	   if(file1.isFile()&& file1.getName().equals(filename)) {
    		   System.out.println("File found");
    		   k=1;
    		   break;
    	   }
    	   sc.close();	       
       }
       if(k==0) {
 		  System.out.println("File not found");
 	   }
    }
}