package test;
import java.util.Scanner;
public class prog5
{
   public static void main(String[] args)
   {
      int i,l;
      int[] ar = new int[5];
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter array elements");
      for(i=0; i<5; i++)
         ar[i] = sc.nextInt();
      
      l = ar[0];
      for(i=1; i<5; i++)
      {
    
    	  if(l<ar[i])
            l = ar[i];
      }
      
      System.out.println("largest is"+l);
   }
}