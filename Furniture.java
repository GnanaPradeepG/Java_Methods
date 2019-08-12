class Box
{
	int l;
	int w;
	int h;

	public Box(int l, int w)
	{
		this.l=l;
		this.w=w;
	}

	public Box(int l,int w, int h)
	{
		this(l,w);
		this.h =h;
	}

	public void Display()
	{
		System.out.println(this.l);
		System.out.println(this.w);
		System.out.println(this.h);
	}
}

class Furniture 
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(5,4);
		b1.Display();
		System.out.println("======================");
		Box b2 = new Box(5,2,1);
		b2.Display();
	}
}
