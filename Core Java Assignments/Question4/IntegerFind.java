package AssignmentQuest4;

import java.util.Scanner;

public class IntegerFind {
	public static void main(String[]args) {
		
//		int[] int_list = {10,20,30,40,50};
//		System.out.print("Available Integer list is ");
		Scanner sc=new Scanner(System.in);
		int[] int_list = new int[5];
		System.out.print("Enter Integer array with 5 elements ");
		for(int i=0;i<5;i++) {
			int_list[i]=sc.nextInt();
			
		}
		System.out.println("Your integer array is");
		
		for(int i:int_list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int search;   
		System.out.println("Enter the number to search from list");
		
		search=sc.nextInt();
		//System.out.println(search);
		for(int i:int_list) {
			if (i==search) {
				System.out.println("The number" +i+" is found ");
				break;
			}
			else  {
				System.out.println("The number is not found");
				break;
			}
			
		}
		
		
		
	}

}
