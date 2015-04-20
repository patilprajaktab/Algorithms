package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

   public static void main(String args[]){
	Scanner input = new Scanner(System. in );

	System.out.println("Enter the size of array to be sorted");

	int size = input.nextInt();

	int[] A = new int[size];

	System.out.println("Enter the elements of array");

	for (int i = 0; i < A.length; i++) {

	A[i] = input.nextInt();

	}

	System.out.println("The UNSORTED array elements are" + Arrays.toString(A));

	insertionsort(A);

	

	System.out.println("The SORTED array elements are" + Arrays.toString(A));

	}

private static void insertionsort(int[] A) {
	// TODO Auto-generated method stub
	
	for(int j=1;j<=A.length;j++)
	{
		int key=A[j];
		int i=j-1;
		
		while(i>=0 && A[i]>key)
		{
			A[i+1]=A[i];
			i--;
			
		}
		A[i+1]=key;
		
		
	}
	
	
	
}

}

