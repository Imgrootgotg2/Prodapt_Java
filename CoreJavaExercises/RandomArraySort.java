package CoreJavaExercises;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySort {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] Array= new int[10];
		for(int i=0;i<10;i++)
		{
			Array[i]=rand.nextInt(100);
			System.out.print(Array[i]+" ");
		}
		System.out.println();
		Arrays.sort(Array);
		for(int i: Array) {
			System.out.print(i+" ");
		}
	}
}
