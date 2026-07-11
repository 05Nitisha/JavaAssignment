package Week3;

public class Employee {

	int id;
	String name;
	double basicSalary=4000.0;
	double totalSalary;
	
	
	Employee(int id,String name,double basicSalary){
		
	
	this.id=id;
	this.name=name;
	this.basicSalary=basicSalary;
	
	}
	public double calculatedSalary()
	{
		double  HRA =this.basicSalary*0.2;
		double Bonus=this.basicSalary*0.1;
		return this.basicSalary+HRA+Bonus;
		
	}
	public void display()
	
	{
		double totalSalary=calculatedSalary();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(basicSalary);
		System.out.println(totalSalary);
		
	}
	
	public static void main(String[] args)
	{
		Employee obj=new Employee(121,"Rajat",4000.0);
				obj.display();
	}
}
