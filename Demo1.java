class Demo1 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Activity Starts");
		Demo1 obj1=new Demo1();
			//one object is enough for any number of methods 
		obj1.walk();
		System.out.println("Take some rest");
		obj1.climb();
		System.out.println("Activity Ends");

	}
	public void walk()
	{
		System.out.println("Walk to the hills");
	}
	public void climb()
	{
		System.out.println("Climb to the peak");
	}
}
