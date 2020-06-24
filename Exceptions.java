package handson;

public class Exceptions {
	int arr[]=new int[5];
 void array(){
	 try {
	   // int arr[]=new int[5];
	    arr[100]=50;
		//System.out.println(" answer is : " + arr);
		 }
  catch(ArrayIndexOutOfBoundsException ae){
		 	System.out.println("Division by zero not definet yet, please enter a valid value");
	}
	 System.out.println(" answer is : " + arr);
	}
 }



class ExceptionDemo{
	public static void main(String[] args) {
		new Exceptions().array();
	}
}




