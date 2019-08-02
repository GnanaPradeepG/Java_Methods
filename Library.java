class Book
{
	String title;
	String author;
	int pages;
	double price;

	public void bookInfo()
	{
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("Pages: "+this.pages);
		System.out.println("Price: "+this.price);
	}
}

class Library 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();

		b1.title="The Alchemist";
		b1.author="Paulo Coelho";
		b1.pages=243;
		b1.price=100.50;

		b2.title="The Subtle art of not giving an f";
		b2.author="Mark Manson";
		b2.pages= 180;
		b2.price=150.00;

		b3.title="Mein Kampf";
		b3.author="Adolf Hitler";
		b3.pages=250;
		b3.price=215.52;

		b4.title="The 02-08-2019a Vinci Code";
		b4.author="Dan Brown";
		b4.pages=250;
		b4.price=200.50;

		b1.bookInfo();
		System.out.println();
		b2.bookInfo();
		System.out.println();
		b3.bookInfo();
		System.out.println();
		b4.bookInfo();
	}
}
