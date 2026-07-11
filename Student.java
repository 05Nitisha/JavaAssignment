package Week3;

 public class Student extends Person {

	int marks;
	 
		
		public Student(String name, int age,int marks) {
		super(name, age);
		this.marks=marks;
		
	}
public void display()

		{
			
			
					System.out.println("Student details are: ");
					System.out.println(name);
					System.out.println(age);
					System.out.println(marks);
		}
		
		
		public static void main(String[] args) {
			Student obj=new Student("Sam",22,100);
			obj.display();
				
		}
 }
 

	