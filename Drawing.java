class  Circle
{
	int r= 3;
	static double pi=3.14;
	public void getArea()
	{

		double CircleArea= r*pi;
		System.out.println(CircleArea);
	}
}

class Rect
{
	double l= 2;
	int w=3 ;
	public void findArea()
	{
		double RectArea=l*w;
		System.out.println(RectArea);
	}
}

class Drawing
{
	public static void main(String[] args)
	{
		System.out.println("CircleArea: ");
		Circle a1 =new Circle();
		a1.getArea();
		System.out.println("Rect Area: ");
		Rect a2= new Rect();
		a2.findArea();
	}
}
