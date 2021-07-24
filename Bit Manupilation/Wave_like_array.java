package trial;

import java.util.Arrays;

public class Wave_like_array {
	
	public static void main(String[]args) {
		int[]arr = {100,99,98,97,87,66,55,44,5,6,3,66,3,0,5353,757};
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
