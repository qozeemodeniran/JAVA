
public class myCar 
{
	public void fullThrotle()
	{
		System.out.println("The car is going as fast as it can");
	}
	
	public void speed(int maxSpeed)
	{
		System.out.println("Max speed is: "+maxSpeed);
	}
	
	public static void main(String args[])
	{
		myCar mycar = new myCar();
		mycar.fullThrotle();
		mycar.speed(200);
	}
}
