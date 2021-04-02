import java.io.*;
import java.util.*;
public class Linearsearch
{
	public static void main(String args[])
	{
		int i,n,x;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter Element : ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter search element : ");
		x = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(x==a[i])
			{
				System.out.print("Element found at position : "+(i+1));
				break;
			}
		}
		if(i==n)
			System.out.print("Element not found");
	}
}