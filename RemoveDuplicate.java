package week5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// Write a Java program to remove duplicate characters from a string while preserving the order of their first occurrence.



String input=" programming";

char[]words=input.toCharArray();
LinkedHashSet<Character>wordExist=new LinkedHashSet<Character>();

StringBuilder sb=new StringBuilder();

for(char word:words)
{
	if(!wordExist.contains(word))
	sb.append(word);
	wordExist.add(word);
	sb.toString();
		
		}
System.out.println(sb);

}
}
