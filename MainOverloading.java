class MainOverloading 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main method of String[] args...");
		MainOverloading d1=new MainOverloading();
		main(234);	//main with int args is called
		d1.main(123.54);	////main with double args is called
	}

	public static void main(int i)
	{
		System.out.println("Inside main method of int args...");
	}
	public void main(double i)
	{
		System.out.println("Inside main method of double args...");
	}
}