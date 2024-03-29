package CoreJavaExercises;

import java.util.Scanner;

public class SmallestArrayElement {
	static int methodSmallest(int arr[],int l)
	{
	    if (l==0) // base case
	        return arr[0];
	    else    
	        return Math.min(arr[l],methodSmallest(arr,l-1));    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallest=0;
		int len;
		System.out.println("Enter the length of the Array: ");
		len= sc.nextInt();
		int []arr = new int[len];
		System.out.println("Enter Array elements: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		smallest=methodSmallest(arr,len-1);
		System.out.println("Smallest value of the Array : "+smallest);
	}
}
