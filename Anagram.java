package week5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Write a Java program to determine whether two strings are anagrams of each other. Ignore spaces and character case.

String str1="listen";
String str2="Silent";

str1=str1.toLowerCase();
str2=str2.toLowerCase();
if(str1.length()==str2.length())
{

char[]char1=str1.toCharArray();
char[]char2=str2.toCharArray();

Arrays.sort(char1);
Arrays.sort(char2);


boolean result=Arrays.equals(char1, char2);

	if (result)
	{
		System.out.println(str1 + " & " + str2 + " are anangram");
		
	}

	else 	
	{
		System.out.println(str1 + "&" + str2 + "are not anangram");
		result=false;
	}
}
	else
	{
		System.out.println(str1+ "&" +str2 + "are not anangram");
}
	}
}
