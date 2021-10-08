/*
Problem : 
  Given an array 
  Given an element k 
  if k > 0  find the sum of next k elements 
  if k < 0  find the sum of the previous k elements  
  Note that the list should be circular and we have to calculate until coubt reaches k
  
  Sample : 
  Input:
      size = 4
      key = 3
      message = [4, 2, -5, 11]
      Output: [8, 10, 17, 1]
      
Explanation:
Step1: [2, -5, 11] = >  8 (sum)
Step2: [-5, 11, 4] = > 10
Step3: [11, 4, 2] =  > 17
Step4: [4, 2, -5] =  > 1

So, the output is [8, 10, 17, 1].

*/



package tirtha.amcat;
import java.util.*;
public class Bomb_defuse {
	public static void main(String[]ars) {
		ArrayList<Integer> list = new ArrayList<>();

    // Taking inputs 
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int k = scan.nextInt();
		int[]a = new int[size];
		
		// Enter the elements in the array
		for(int i=0;i<size;i++) {
			a[i] = scan.nextInt();
		}
		
		
		
		for(int i=0;i<size; i++) {
			//if the element is positive
			if(a[i] >=0 ) {
				int sum = 0;
				int count = 0;
				int j = i;
				while(count<k) {
					sum = sum + a[(j+1)%size];   // circular
					j++;
					count++;
				}
				list.add(sum);
			}
			
			// if the element is negative
			else {
				int sum = 0;
				int count = 0;
				int j = i-1;
				while(count < k) {
					if(j<0) {
						j = size-1;
					}
					sum = sum + a[(j) % size];
					j--;
					count++;
				}
				list.add(sum);
			}
		}
		System.out.println(list);
		
		
	}
}
