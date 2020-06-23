package firstapp;
public class varArgs {

	
	public static void main(String[] agrs)
	{ 
		new varArgs().add();
	}

	int total;
	int add(int...values)
	{
		for(int a:values)
		{
			total+=a;
}
   return total;
}


}

