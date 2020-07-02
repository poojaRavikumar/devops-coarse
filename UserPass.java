package com.company;

import java.util.Scanner;


public class UserPass {
	
	public boolean UserPassword() {
	Scanner scan =new Scanner(System.in);
	String user, pass;
	System.out.println("enter the username");
	user=scan.nextLine();
	System.out.println("enter the password");
	pass=scan.nextLine();
	
	if(user.equals("admin")&& (pass.equals("manager")))
			{
		
		return true;
			}
	else {
		
	
	return false;
	}

}
	}