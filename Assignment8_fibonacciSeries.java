package week1;

public class Assignment8_fibonacciSeries {

	public static void main(String[] args) {
		int num=10;
		int firstterm=0;
		int secondterm=1;
		System.out.println("fibonacci series upto " +num + "terms:");
		for (int i=1;i<=num;i++)
		{
			System.out.println(firstterm + "");
			 
			int nextterm=firstterm+ secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
	}

}
