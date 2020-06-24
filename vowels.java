package handson;

public class vowels {
	public static void main(String[] args)
	{
		String str ="encyclopedia";
		String str2=" ";
		//char ch;
		for(int i=0;i<=str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				str2=str2+ch;
				
			}
			System.out.println("vowles are"+str2);
		}
	}

}
