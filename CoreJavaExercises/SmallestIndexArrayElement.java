package CoreJavaExercises;

import java.util.Scanner;

public class SmallestIndexArrayElement {
	static int methodSmallestIndex(int arr[],int start)
	{
		if (start == arr.length - 1) {
            // Base case: reached the end of the array
            return start;
        } else {
            // Recursive case: compare current element with the smallest element in the rest of the array
            int restSmallestIndex = methodSmallestIndex(arr, start + 1);
            return (arr[start] < arr[restSmallestIndex]) ? start : restSmallestIndex;
        }    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int indexOfSmallest=0;
		int len;
		System.out.println("Enter the length of the Array: ");
		len= sc.nextInt();
		int []arr = new int[len];
		System.out.println("Enter Array elements: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		indexOfSmallest=methodSmallestIndex(arr,0);
		System.out.println("Index of the smallest value in the Array : "+indexOfSmallest);
	}
}
