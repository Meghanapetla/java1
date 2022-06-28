package test;

public class secondlargest {

	public static void main(String[] args) 
	{
		int largest=0;
		int secondlargest=0;
		int []arr= {64,45,87,62,94};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest)
			{
				secondlargest=arr[i];
				}
			}
		System.out.println(secondlargest);

	}

}