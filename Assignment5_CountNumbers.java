package week1;

public class Assignment5_CountNumbers {

	public static void main(String[] args) {
		int number =987654 ;
		int count = 0;
		
		for (int num=number;num>0;num/=10)
		{
			count++;
			
		}
		
		System.out.println("Number of Digits: " +count);
		

	}

}
