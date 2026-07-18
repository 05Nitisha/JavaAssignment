package Week4;

public class Employee {
	
	int empId;
	String name;
	float salary;
	static String companyName="ABC Technologies";
	
	public Employee(int empId,String name,float salary) 
	
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public void displayEmployee()
	{
		System.out.println();
		
		System.out.println("Employee Details");
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Employee ID :" +empId);
		
		System.out.println();
		
		System.out.println("Name :" +name);
		
		System.out.println();
		
		System.out.println("Salary :" +salary);
	}
	
	public static void displayCompany()
	{
		System.out.println("Company Name :" +companyName);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(101,"Priya",50000.0f);
		
		Employee emp2=new Employee(102,"Rahul",62000.0f);
		
		Employee emp3=new Employee(102,"Anjali",58000.0f);
		
		Employee.displayCompany();
		
		emp1.displayEmployee();
		
		emp2.displayEmployee();
		
		emp3.displayEmployee();

	}

}
