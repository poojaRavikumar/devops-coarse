package firstapp;
import java.util.Scanner;
public class season {
	public static void main(String[] agrs)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the months from 1 to 12 we will tell you what season is .....");
		int num=s.nextInt();
		switch(num)
		{

		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("autumn");
			break;
			default:
				System.out.println("sorry! only 12moths in a year");
			
		}
	}
}
