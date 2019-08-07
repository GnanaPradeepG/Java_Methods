class Gun
{
	String gName;
	public Gun()
	{
		this.gName = "ak47";
	}
	public Gun(String gName)
	{
		this.gName= gName;
	}
}

class GunShop 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");

		Gun g1 =new Gun();
		System.out.println(g1.gName);
		Gun g2 = new Gun();
		System.out.println(g2.gName);
		Gun g3= new Gun("Groza");
		System.out.println(g3.gName);
		Gun g4 = new Gun();
		System.out.println(g4.gName);
		Gun g5 = new Gun("AWM");
		System.out.println(g5.gName);

		System.out.println("main ends");
	}
}
