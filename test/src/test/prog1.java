package test;
import java.util.Scanner;
public class prog1
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array :");
int size=sc.nextInt();
System.out.println("Enter array elements");
int ar[]=new int[size];
for(int i=0; i<ar.length; i++)
{
        ar[i]=sc.nextInt();
    }
    System.out.println("Even no.s");
    for(int i=0; i<size; i++)
    {
        if(ar[i]%2==0)
        {
            System.out.println(ar[i]);
        }
    }
    
System.out.println("Odd no.s");
    for(int i=0; i<size; i++)
    {
        if(ar[i]%2==1)
        {
            System.out.println(ar[i]);
        }
    }
}
}