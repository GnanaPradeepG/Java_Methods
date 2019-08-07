class Gun 
{
	int bullets;
	public void shoot()
	{
		for (int i = this.bullets ;i>=1 ; i-- )
		{
			System.out.print("=D>");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
	Gun g1= new Gun();
	g1.bullets = 10;
	g1.shoot();
	Gun g2= new Gun();
	g2.bullets = 40;
	g2.shoot();
	}
}
