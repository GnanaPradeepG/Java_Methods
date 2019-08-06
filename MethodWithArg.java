

fdx
class	MethodWithArg
{
	public static void main(String[] args) 
	{
		test1(7);
		test2("html",8.6);
		test3(true);
	}

	public static void test1(int i)
	{
		System.out.println(i);
	}

		public static void test2(String x, double y)
	{
		System.out.println(x+" "+y);
	}

		public static void test3(boolean z)
	{
		System.out.println(z);
	}
}