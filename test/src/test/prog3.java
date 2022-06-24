package test;
import java.util.Scanner;
public class prog3
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[50];
        int sum = 0,n;
        float avg;
        System.out.println("Enter no.of elements in array:");
        n = sc.nextInt();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }
        sc.close();
        for (int num: ar) {
            sum=sum+num;
        }
        avg=sum/n;
        System.out.println("average=" + avg);
    }
}