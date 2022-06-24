package test;
import java.util.Scanner;
public class prog6 
{
	public static void main(String[] args) 
	{
		int n, i;
		int even=0,odd= 0;
		Scanner sc = new Scanner(System.in);
	 
		System.out.println("Enter number of elements in array: ");
		n = sc.nextInt();		
		int [] a = new int[n];
		System.out.println("enter array elements ");
		for (i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}   

		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}		
		System.out.println("Number of Even Numbers = " + even);
		System.out.println("Number of Odd  Numbers = " + odd);
	}
}