package test;

public class threemultiple_indexvalues {

	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,6,7,8,9};
		
		for(int i=1;i<arr1.length;i++) {
				if(i%3==0) {
				System.out.print(arr1[i]+" ");
				}
			}

	}

}
