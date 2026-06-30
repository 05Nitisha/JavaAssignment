package week1;

public class Assignment9_Largestnumber {

	public static void main(String[] args) {
		int i=59371;
		int largestnumber=0;
		for(;i>0;)
		{
			int mod=i%10;//1,7,3,9,5
			if(largestnumber<mod)//0<1 True,1<7True,7<3false,7<9True,9<5False
			largestnumber=mod;//1,7,7,9,9
			i=i/10;//59371,5937,593,59,5,0
		
		}
System.out.println("the Largest Number is " +largestnumber);
	}

}
