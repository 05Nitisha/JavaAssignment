package Week4;

public class Car extends Vehicle  {
	
	 String model;
	
	public Car(String brand, int year,String model) {
		super(brand, year);
		this.model=model;
	}
	@Override
		public void  displayVehicleInfo()
		{
			super.displayVehicleInfo();
			
			System.out.println();
			
			System.out.println("Car Information: ");
			
			System.out.println();
			
			System.out.println("model: " +model);
			
			
		}
	public static void main(String[] args)
	{
		Car obj=new Car("Toyota",2023,"Fortuner");
				
		obj.displayVehicleInfo();
		
		
		
	}
		
	}

	
	
	


