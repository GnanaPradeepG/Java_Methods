class  AppDevo
{
	public static void main(String[] args) 
	{
		System.out.println("Analyst Analysis the requirements");
		AppDevo obj=new AppDevo();
		developer();
		obj.tester();
		System.out.println("Maintainance and cloud computing");
	}

	public static void developer()
	{
		System.out.println("App is developed according to instructions");
	}

	public void tester()
	{
		System.out.println("App is tested using selenium");
	}
}
