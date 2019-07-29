//intitally jvm enters into stack area
//then calls class loader into stack 
//class loader collects all static members and stores in static pool area
// static members here are talk method ; main method
//then jvm calls main method to execute line by line

class ExecutionProcess3
{

	public static void talk()
	{
		System.out.println("Who are you?");
	}
	public void reply()
	{
		System.out.println("I am Arcus, your personal assistant");
	}
	public static void main(String[] args) 

	{
		System.out.println("main starts"); //directly print
		ExecutionProcess3 obj = new ExecutionProcess3();
		//create an object store non-static values in it
		talk();
		//call static method from static pool area
		
		obj.reply();
		//call non-static methods stored in object
		System.out.println("main ends");// directly print
	
	}//exit main
}
