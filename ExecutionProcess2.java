//intitally jvm enters into stack area
//then calls class loader into stack 
//class loader collects all static members and stores in static pool area
// static members here are i=1 ; j=3.2 ; main method
//then jvm calls main method to execute line by line

class ExecutionProcess2
{
	static int i=1;
	static double j=3.2;
	String p="Test";
	char n='A';

	public static void main(String[] args) 

	{
		System.out.println("main starts"); //directly print
		ExecutionProcess2 obj = new ExecutionProcess2();
		//create an object store non-static values in it
		System.out.println(i);
		System.out.println(j);
		//print i,j by taking value from static pool area
		
		System.out.println(obj.p);
		System.out.println(obj.n);
		//print p;n values stored in object
		System.out.println("main ends");// directly print
	
	}//exit main
}
