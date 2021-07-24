package trial;

import java.util.Arrays;

public class Wave_like_array {
	
	public static void main(String[]args) {
		int[]arr = {1,2,3,4,5};
		Arrays.sort(arr);
		//sorted array
		
		for(int i=0;i<arr.length;i=i+2) {
			int temp=0;
			temp =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		
		for(int x:arr) {
			System.out.print(x+ " ");
		}
		
		
	}
	
	
	

}

// output -> 2 1 4 3 5 
