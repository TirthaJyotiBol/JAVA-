/*
 Given k sorted arrays in the form of ArrayList of ArrayLists 
 We need to merge them to get the Sorted Array
 */

package Heap;
import java.util.*;
public class Merge_k_sorted_Arrays {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > arr=new ArrayList<ArrayList<Integer>>();
		
	    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
	        a1.add(10); 
	        a1.add(20);
	        a1.add(30);
	        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
	        a2.add(5);
	        a2.add(15);
	        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
	        a3.add(1); 
	        a3.add(9); 
	        a3.add(11);
	        a3.add(18);
	        
	        arr.add(a1);
	        arr.add(a2);
	        arr.add(a3);
	        
	        merge(arr);
	}
	
	static class Triplet implements Comparable<Triplet>{
		int value;
		int arr_pos;
		int ele_pos;
		Triplet(int value,int arr_pos,int ele_pos){
			this.value = value;
			this.arr_pos = arr_pos;
			this.ele_pos = ele_pos;
		}
		@Override
		public int compareTo(Triplet o) {
			if(value<=o.value) return -1;
			else return 1;
		}
	}
	
	static void merge(ArrayList<ArrayList<Integer>>list) {
		ArrayList<Integer>ans = new ArrayList<>();
		PriorityQueue<Triplet>pq = new PriorityQueue<>();
		
		// initially add the first index elements into the Priority Queue
		for(int i=0;i<list.size();i++) {
			pq.add(new Triplet(list.get(i).get(0),i,0));
		}
		
		while(!pq.isEmpty()) {
			Triplet curr = pq.peek();
			
			int curr_val = curr.value;
			int curr_ele_pos = curr.ele_pos;
			int curr_arr_pos = curr.arr_pos;
			
			ans.add(curr_val);
			pq.poll();
			
			// if next element position of the current array index is less than its size then add the next element
			if(curr_ele_pos+1 < list.get(curr_arr_pos).size()) {
				pq.add(new Triplet(list.get(curr_arr_pos).get(curr_ele_pos+1), curr_arr_pos, curr_ele_pos+1));
			}		
		}
		
		System.out.println(ans);
	}

}
