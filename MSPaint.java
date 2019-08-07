class Rect
{
	int l;
	int w;
	public Rect()
	{
		this.l = 7;
		this.w = 8;
	}
	public Rect(int l, int w)
	{
		this.l = l;
		this.w = w;
	}

	public void rectDim()
	{
		System.out.println("Length is: "+this.l);
		System.out.println("Width is: "+this.w);
	}
}
class  MSPaint
{
	public static void main(String[] args) 
	{
		Rect r1 = new Rect();
		Rect r2 =new Rect(4,2);
		Rect r3 = new Rect(8,2);
		Rect r4 =new Rect();
		r1.rectDim();
		r2.rectDim();
		r3.rectDim();
		r4.rectDim();
	}
}
