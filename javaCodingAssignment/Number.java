package javaCodingAssignment;

import java.util.Scanner;

public class Number {
	
	//Prime check
	private static Boolean checkPrime(int x) {
		for(int i=2;i<x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}

	//Amstrong check
	private static Boolean checkAmstrong(int x) {
		int y=x;
		int reminder,result=0,length=0;
		while(y!=0)
		{
			length++;
			y/=10;
		}
		y=x;
		while(y!=0) {
			reminder=y%10;
			y/=10;
			result+=Math.pow(reminder, length);
		}
		if(result==x)
			return true;
		else
			return false;
	}
	
	//Palindrome check
	private static Boolean checkPalindrome(int x) {
		int y=x,result=0;
		while(y!=0) {
			result*=10;
			result+=y%10;
			y/=10;
		}
		if(result==x)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer Operations available: ");
		System.out.println("1. Check Prime.\n2. Check Amstrong.\n3. Check Palindrome.");
		System.out.println("Enter your choice: ");
		int userChoice = sc.nextInt();
		System.out.println("Enter value to check: ");
		int input = sc.nextInt();
		switch(userChoice)
		{
			case 1:
				System.out.println("Prime check: "+checkPrime(input));
				break;
			
			case 2:
				System.out.println("Amstrong check: "+checkAmstrong(input));
				break;
			
			case 3:
				System.out.println("Palindrome check: "+checkPalindrome(input));
				break;
			default:
				System.out.println("Invalid choice!!");
				break;
		}
	}
}
