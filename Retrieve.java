package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.company.SearchFile;

public class Retrieve {

	  public  void RetreiveFile ()
	  { 
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter directory to retreive!");
		  
		 File dir = new File(s.next());
		
	    if(dir.isDirectory())
	    {

         File[] files = dir.listFiles();

	      System.out.println("RETREIVING FILE......");
	      System.out.println("THE FILES AND FOLDERS IN THE GIVEN DIRECTORY\n");
	     
	      for(File file:files)
	      { 
	    	 
	        System.out.println(file.getName());
	      }

}
	  }
	  public void AddFile() {
			 
				Scanner scan=new Scanner(System.in);
				System.out.print("enter the directory.");
				File fdir= new File(scan.next());
				System.out.println("enter the file name to be created.. " );
		        String name = scan.next();
		         File f = new File(name); 

		         if(fdir.isDirectory()) {
		         try {
					if (f.createNewFile()) 
					     System.out.println("File is created"); 
					 else
					     System.out.println("file already exist...");
				} catch (IOException e) {
					
				} 
		     }
		         else {
		        	System.out.println("no such directory");
		        }
		        	 }
		
	  public void DeleteFile() {
		  Scanner scan=new Scanner(System.in);
			System.out.print("enter the directory.");
			File fdir= new File(scan.next());
			System.out.println("enter the file name to be deleted.. " );
	        String name = scan.next();
	         File f = new File(name); 

	         if(fdir.isDirectory()) {
	         if (f.delete()) 
			     System.out.println("File is deleted"); 
			 else
			     System.out.println("file dosen't exist..."); 
	     }
	         else {
	        	System.out.println("no such directory");
	        }
	        	 }
}
