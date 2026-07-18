package Week4;

public class Vehicle {
	
	String brand;
	int year;
	
public Vehicle(String brand,int year)
{
	this.brand=brand;
	this.year=year;
}

	public void displayVehicleInfo()
	{
		System.out.println("Vehicle Information");
		
		System.out.println(); 
		
		System.out.println("Brand:" +brand);
		
		System.out.println();
		
		System.out.println("Year:" +year);
	}

}
