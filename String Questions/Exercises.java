package AssignQuestion;

import java.util.Arrays;

public class Exercises {
	
	public static boolean isAnagram(String str1,String str2){
		String s1 = str1.replaceAll("\\s", "");    
		String s2 = str2.replaceAll("\\s", "");    
		boolean status = true;
		if (s1.length() != s2.length())   
		{       
			status = false;    
		}
		else   
		{
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status = Arrays.equals(arrayS1, arrayS2);    
		}    
		if (status)   
		{     
			System.out.println(s1 + " and " + s2 + " are anagrams");    
		}   
		else   
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");    
		}
		return status;
	}
	
	public static void main(String[] args) {
		//Exercise 1
		String hi = "Hi, ";
		String mom = "mom.";
		String result =hi.concat(mom);
		System.out.println(result);
		
		//Exercise 2
		String Name = "Shivaraman Ganapathi Srinivasan";
		String[] names = Name.split(" ");
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i].charAt(0));
		}
		
		//Exercise 3
		isAnagram("HEART", "EARTH");    
		isAnagram("TRIANGLE", "INTEGRAL");    
		isAnagram("TOSS", "SHOT");  
		
	}
}
