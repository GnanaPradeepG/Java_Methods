class InfoDisplay
{
	String studentName;
	String mobileNumber;
	String companyName_1;
	String companyName_2;
	String companyName_3;
	String batchCode;

	public InfoDisplay()
	{
		this.studentName= studentName;
		this.mobileNumber = mobileNumber;
		this.companyName_1 = companyName_1;
		this.batchCode = batchCode;
	}

	public InfoDisplay(String studentName, String mobileNumber, String companyName_1, String batchCode)
	{
		this.studentName= studentName;
		this.mobileNumber = mobileNumber;
		this.companyName_1 = companyName_1;
		this.batchCode = batchCode;
	}
    
		public InfoDisplay(String studentName, String mobileNumber, String companyName_1, String companyName_2, String batchCode)
	{
		this.studentName= studentName;
		this.mobileNumber = mobileNumber;
		this.companyName_1 = companyName_1;
		this.companyName_2 = companyName_2;
		this.batchCode = batchCode;		
	}
    
		public InfoDisplay(String studentName, String mobileNumber, String companyName_1, String companyName_2, String companyName_3, String batchCode)
	{
		this.studentName= studentName;
		this.mobileNumber = mobileNumber;
		this.companyName_1 = companyName_1;
		this.companyName_2 = companyName_2;
		this.companyName_3 = companyName_3;
		this.batchCode = batchCode;		
	}
    
	public void Display()
	{	
		if (studentName==null)
		{
			System.out.println("***Batch code is compulsory***");
		}
		else
		{
			System.out.println("StudentName: "+this.studentName);	
		}

		if (mobileNumber==null)
		{
			System.out.println("***mobileNumber is compulsory***");
		}
		else
		{
			System.out.println("MobileNumber: "+this.mobileNumber);
		}

		if (companyName_1==null)
		{
			System.out.println("***Atleast one company name is required***");
		}
		else
		{
			System.out.println("Company name is: "+companyName_1);
		}

	
		if (companyName_2 == null)
		{
		}
		else
		{
			System.out.println("Companyname is : "+companyName_2);	
		} 

		if (companyName_3 == null)
		{
		}
		else
		{
			System.out.println("Companyname is : "+companyName_3);	
		}

		if (batchCode==null)
		{
			System.out.println("***Batch code is compulsory***");
		}
		else
		{
			System.out.println("Batch Code is: "+batchCode);
		}
		
	}

}

class  JspidersTodayReq
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		System.out.println();

		System.out.println("Error Case");
		System.out.println();
		InfoDisplay d1 = new InfoDisplay();
		d1.Display();
		System.out.println();

		System.out.println("case1:");
		System.out.println();
		InfoDisplay d2 = new InfoDisplay("Pradeep", "7013181356" , "Mindtree" , "TECE3");
		d2.Display();
		System.out.println();

		System.out.println("Case2: ");
		System.out.println();
		InfoDisplay d3 = new InfoDisplay("Arcus" , "9440158969" , "Zensar" , "Syntel" , "TECE3");
		d3.Display();
		System.out.println();

		System.out.println("Case3:");
		System.out.println();
		InfoDisplay d4 = new InfoDisplay("Alan Walker" ,"6002475678" , "Mindtree" , "Zensar" , "Syntel" , "newbatch");
		d4.Display();
		System.out.println();

		System.out.println("Main ends");
	}
}
