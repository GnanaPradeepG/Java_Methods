class Sample
{
	public void shoot() 
	{
		System.out.println("shoot bullets...");
				
	}

	public static void main(String[] args)
	{
		System.out.println("main starts");
		Sample obj1=new Sample();
		obj1.shoot();
		System.out.println("main ends");
	}
}