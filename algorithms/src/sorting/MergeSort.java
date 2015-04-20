	package sorting;
	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class MergeSort {
		public static void main(String args[])
	
	
	
		{
	
	
	
		Scanner input = new Scanner(System. in );
	
		System.out.println("Enter the size of array to be sorted");
	
		int size = input.nextInt();
	
		int[] A = new int[size];
	
		System.out.println("Enter the elements of array");
	
		for (int i = 0; i < A.length; i++) {
	
		A[i] = input.nextInt();
	
		}
	
		System.out.println("The UNSORTED array elements are" + Arrays.toString(A));
	
		int p = 0, r = size - 1;
	
		mergesort(A, p, r);
	
		System.out.println("The SORTED array elements are" + Arrays.toString(A));
	
		}
	
	
	
		private static void mergesort(int[] A, int p, int r) {
	
	
	
		// TODO Auto-generated method stub
	
		if (p < r)
	
	
	
		{
	
	
	
		int q = (p + r) / 2;
	
	
	
		mergesort(A, p, q);
	
	
	
		mergesort(A, q + 1, r);
	
	
	
		merge(A, p, q, r);
	
	
	
		}
	
		}
	
		private static void merge(int[] A, int p, int q, int r) {
	
		int n1 = (q - p) + 1;
	
		int n2 = r - q;
	
		int[] l = new int[n1 + 1];
	
	
	
		int[] R = new int[n2 + 1];
	
	
	
		l[n1] = Integer.MAX_VALUE;
	
	
	
		R[n2] = Integer.MAX_VALUE;
	
	
	
	
	
		for (int i = 0; i < n1; i++)
	
	
	
		{
	
		l[i] = A[p + i];
	
	
	
		}
	
	
	
		for (int j = 0; j < n2; j++)
	
	
	
		{
	
		R[j] = A[q + j + 1];
	
	
	
	
	
		}
	
	
	
		int x = 0, y = 0;
	
		for (int k = p; k <= r; k++) {
	
		if (l[x] <= R[y]) {
	
		A[k] = l[x];
	
		x++;
	
		} else {
	
		A[k] = R[y];
	
		y++;
	
		}
	
		}
		
		
		
	}
	}