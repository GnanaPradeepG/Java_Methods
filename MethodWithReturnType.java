
class MethodWithReturnType 
{
	public static char test1()
	{
		return '@';
	}
	
	public static int test2()
	{
		return 78;
	}

	public static boolean test3()
	{
		return true;
	}

	public static void main(String[] args) 
	{
		char i =test1();
		int j =test2();
		boolean k = test3();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		}
}
