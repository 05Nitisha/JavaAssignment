package week1;

public class Assignment7_SumofDigits {

	public static void main(String[] args) {
		int num=4567;
		
		int sum=0;
		for (int temp=num;temp>0;temp/=10)
		{
			sum+=temp%10;
		}
System.out.println("the sum of digits of " +num+ " is " + sum);
	}

}
