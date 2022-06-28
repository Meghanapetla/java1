package test;
import java.util.Scanner;
public class revstring 
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=sc.nextLine();	
		System.out.println("Reverse of a String '"+str+"' is  :"); 
		int size=str.length();
        for(int i=size-1;i>=0;i--)
        {
        	System.out.print(str.charAt(i));
        	
        }
}
}