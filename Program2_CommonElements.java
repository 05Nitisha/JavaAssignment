package week2;

import java.util.HashSet;

public class Program2_CommonElements {

	public static void main(String[] args) {
		int arr1[] = {2, 5, 7, 9, 11, 5};
		int arr2[] = {1, 6, 7, 15, 20, 5};
		
		HashSet<Integer>hs=new HashSet<>();//hashset stores only unique values

		System.out.println("Common ELements: ");
		
		for(int i=0;i<arr1.length;i++) 
		{
			
			
		
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]) {
					
						
			
			
			hs.add(arr1[i]);
			break;
		}
	}
}
		for(int num:hs) {
			System.out.println(num);
		}
	}

	}

