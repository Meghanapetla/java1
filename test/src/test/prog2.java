package test;
import java.util.Scanner;
public class prog2 
{
	public static void main(String[] args) 
	{
		int n, i, Sum = 0;
		Scanner sc = new Scanner(System.in);
	 
		System.out.println("Enter number of elements ");
		n= sc.nextInt();	
		int [] a = new int[n];
		System.out.println("enter elements of an Array  : ");
		for (i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < n; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println(Sum);
	}
}