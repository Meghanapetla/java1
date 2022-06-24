package test;
import java.util.Scanner;
public class test_prog 
{
	public static void main(String[] args) 
	{
		    Scanner sc= new Scanner(System.in);
		    System.out.print("Enter size of the array: ");
		    int n = sc.nextInt();
            int nums[] = new int[n];
		    System.out.println("Enter elements in array:");
		    for (int i=0; i<n;++i)
		    {
		      nums[i] = sc.nextInt();
		    }
		    displayOddEven(nums);
		    sc.close();

		  }
    public static void displayOddEven(int[] numbers) 
    {
		    for (int i:numbers)
		    {
	      if(i%2 == 0)       
	        System.out.println(i+": Even");
	      else             
	        System.out.println(i+": Odd");
		    }   
		  }
}
