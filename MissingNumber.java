package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer>list=Arrays.asList(1,2,4,6,7,9);

int N=10;

LinkedHashSet<Integer>set1=new LinkedHashSet<Integer>(list);

List<Integer>missingList=new ArrayList<>();


for(int i=1;i<=N;i++)
{
	if(!set1.contains(i))
	missingList.add(i);
}
System.out.println(missingList);



	}
}
