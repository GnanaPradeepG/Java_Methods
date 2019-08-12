class Watch
{
	int hour;
	int minute;
	int second;

	public Watch(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	public Watch(int hour, int minute, int second)
	{
		this(hour,minute);
		this.second = second;
	}

	public void display()
	{
		System.out.println(this.hour);
		System.out.println(this.minute);
		System.out.println(this.second);
	}
	
}

class  Fasttrack
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		
		Watch w1 = new Watch(10,10);
		Watch w2 = new Watch(13,45,34);

		w1.display();
		w2.display();

		System.out.println("Main Ends");
	}
}
