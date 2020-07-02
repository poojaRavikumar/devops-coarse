package com.company;
import com.company.UserPass;
import com.company.SearchFile;
import com.company.Retrieve;
import java.util.Scanner;
public class DisplayDemo {
	

	
		public static void main(String[] args) {
			
			Retrieve rf=new Retrieve();
			SearchFile sf=new SearchFile();
			UserPass up=new UserPass();
			
			if(up.UserPassword()) {
				System.out.println("WELCOME ADMIN!");
			System.out.println("YOU HAVE SUCCESSFULLY LOGINED IN TO OUR PORTAL\n");
			
			System.out.println("\n\n :: USER MENU ::\n\n");
			
			System.out.println("1. List All Files in the Directory\n 2. Add file in the directory \n 3. delete file in the Directory\n 4. search the particular file\n ");
			Scanner s=new Scanner(System.in);
			
			System.out.println("enter your option");
			int opt=s.nextInt();
			switch(opt)
			{
			case 1:
				rf.RetreiveFile();
				break;
			case 2:
				rf.AddFile();
				break;	
			case 3:
				rf.DeleteFile();
				break;
			case 4:
				sf.SFile();
				break;
			
				default:
					System.out.println("check your option again....");
			}
			
			
			}
			else {
				System.out.println("YOU ARE AUTHOURIZED USER");
			}
	}

}
