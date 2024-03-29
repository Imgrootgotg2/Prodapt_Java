package CoreJavaExercises;

import java.util.Scanner;

public class ArraySum {
	static int methodSum(int arr[],int l)
	{
	    if (l < 0) // base case
	        return 0;
	    else    
	        return arr[l]+methodSum(arr,l-1);    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int len;
		System.out.println("Enter the length of the Array: ");
		len= sc.nextInt();
		int []arr = new int[len];
		System.out.println("Enter Array elements: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		/*for(int i: arr) {
			sum+=i;
		}*/
		sum=methodSum(arr,len-1);
		System.out.println("Sum of the Array : "+sum);
	}
}
