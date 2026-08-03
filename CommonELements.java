package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonELements {

	public static void main(String[] args) {
		
		List<Integer>list1=Arrays.asList(1,2,3,4,5);
		List<Integer>list2=Arrays.asList(3,4,5,6,7);
		
		
		HashSet<Integer>set1=new HashSet<Integer>(list1);
		
		HashSet<Integer>finalResult=new HashSet<Integer>();
		
		for(Integer num:list2)
		{
			if(set1.contains(num))
			{
				finalResult.add(num);
			}
		}
		System.out.println("Common elements are "+finalResult);
		}
		
			
		
	
}
