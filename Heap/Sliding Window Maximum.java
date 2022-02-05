package Heap;
import java.util.*;
public class Sliding_Window_maximum {

	public static void main(String[] args) {
		 int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
	     int k = 4;
	     ArrayList<Integer>ans = maximum(arr,k);
	     System.out.println(ans);
	}
	
	static ArrayList<Integer> maximum(int[]a,int k) {
		PriorityQueue<Integer>max = new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Integer>ans = new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			max.add(a[i]);
		}
		ans.add(max.peek());
		
		max.remove(a[0]);
		
		for(int i=k;i<a.length;i++) {
			max.add(a[i]);
			ans.add(max.peek());
			max.remove(a[i-k+1]);	
		}
		
		return ans;
	}

}
