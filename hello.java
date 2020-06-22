package first;

import java.util.Scanner;

public class hello {
	
	public static void main(String[] agrs)
	{
		int i,fact=1;
Scanner s = new Scanner(System.in);
System.out.println(" enter the number");
int num=s.nextInt();
for(i=1;i<=num;i++)
{
	fact=fact*i;
}

System.out.println("the factorial is "+fact);
	}
	
}
