package handson;
import java.lang.String;
import java.util.Scanner;

  public class Palindrome {
	public static void main(String[] args)
	 {
	int i=0, n;
	String anotherStr=" ";
      Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	   String str =s.next();
	n=str.length();
	for (i =n; i >= 0;i-- ) {
        anotherStr =  anotherStr + str.charAt(i);

     if (str.equals( anotherStr))
        System.out.println(str+" is a palindrome");
     else
        System.out.println(str+" is not a palindrome");

  }
}
}