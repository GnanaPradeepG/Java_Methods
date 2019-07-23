/*  write a program to create 1 global variable two methods
1.main method 2.static method
print global varible in both the methods
call the method from main */
class Variable_2 
{
	static String value="Odd number";
	public static void main(String[] args) 
	{
		System.out.println("1 is an "+value);
		even();
	}
	public static void even()
	{
		System.out.println("2 is not an "+value);
	}
}
