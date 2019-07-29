//intitally jvm enters into stack area
//then calls class loader into stack 
//class loader collects all static members and stores in static pool area
// static members here are k=34; main method
//then jvm calls main method to execute line by line

class ExecutionProcess1
{
	static int k=34;
	int j=56;
	public static void main(String[] args) 
	{
		System.out.println("main starts"); //directly print
		System.out.println(k);//print k by taking value from static pool area
		ExecutionProcess1 obj =new ExecutionProcess1();
		//create an object store non-static values in it
		System.out.println(obj.j);//print j values stored in object
		System.out.println("main ends");// directly print
	
	}//exit main
}
