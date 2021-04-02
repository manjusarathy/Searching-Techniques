import java.io.*;
import java.util.*;
class BinarySearch 
{ 
	int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r >= l) { 
			int mid = l + (r - l) / 2; 
			if (arr[mid] == x) 
				return mid; 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid - 1, x); 
			return binarySearch(arr, mid + 1, r, x); 
		} 
		return -1; 
	} 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = new int[10]; 
		int n ,i,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter search element : ");
		x = sc.nextInt();
		int result = ob.binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 
