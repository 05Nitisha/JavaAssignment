package week5;

public class SumofString {

	public static void main(String[] args) {
		
		//Sum of Numbers in a String
		
		String input="10,20,30,40";
		
		String[]arr=input.split(",");
		int sum=0;
		
		for(String num:arr)
		{
			Integer numTotal=Integer.parseInt(num.trim());
			sum+=numTotal;
		}
		System.out.println("Sum of String is : "+sum);
}
}