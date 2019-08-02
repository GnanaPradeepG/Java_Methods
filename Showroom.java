
class Car
{
	String name;
	double mileage;
	String color;
	public void info()
	{
	System.out.println("Brand: "+ this.name);
	System.out.println("Mileage: "+ this.mileage);
	System.out.println("Color: "+ this.color);
	}
}


class Showroom 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.name = "lamborgini";
		c1.mileage = 21.3;
		c1.color ="Red";
		c1.info();
		Car c2 = new Car();
		c2.name="BMW";
		c2.mileage = 18.9;
		c2.color = "Black";
		c2.info();
	}
}
