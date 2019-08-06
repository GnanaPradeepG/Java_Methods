class add
{
	public static void test(int i,int j)
	{
		System.out.println(i+j);
	}

	public static void test(int i,double j)
	{
		System.out.println(i+j);
	}

	public static void test(double i,int j)
	{
		System.out.println(i+j);
	}

	public static void test(int i,int j, int k)
	{
		System.out.println(i+j+k);
	}

}

class MethodOverloading_add
{
	public static void main(String[] args) 
	{
		add.test(2,3);
		add.test(2,1.8);
		add.test(3.2,7);
		add.test(4,2,1);
	}
}
