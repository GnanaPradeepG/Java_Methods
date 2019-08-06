class Substraction
{
	public static void sub(int i,int j)
	{
		System.out.println(i-j);
	}

	public static void sub(int i,double j)
	{
		System.out.println(i-j);
	}

	public static void sub(double i,int j)
	{
		System.out.println(i-j);
	}

	public static void sub(double i,double j)
	{
		System.out.println(i-j);
	}

}

class MethodOverloadingSub
{
	public static void main(String[] args) 
	{
		Substraction.sub(5,3);
		Substraction.sub(5,2.3);
		Substraction.sub(2.8,1);
		Substraction.sub(3.1,2.8);
	}
}
