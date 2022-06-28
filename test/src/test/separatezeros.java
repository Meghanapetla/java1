package test;
import java.util.Arrays;
public class separatezeros {

	public static void main(String[] args) {

		int array[]= {1,0,3,0,5,6};
		int count=0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				array[count++]=array[i];
			}
		}
		while(count<array.length) {
			array[count++]=0;
		}
		for(int j=0; j<array.length; j++) {
			System.out.print(array[j]);
		}
		
		}
		
		
	}