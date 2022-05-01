package stack_and_queue;
import java.util.*;
public class SlidingWindowMaximum {

	// we need the index so as to remove the last element to mantain the window size
	static class pair{
		int data;
		int index;
		pair(int index,int data){
			this.data = data;
			this.index = index;
		}
	}
	
	static ArrayList<Integer> swm(ArrayList<Integer>a,int k){
		ArrayList<Integer>ans = new ArrayList<>();
		Deque<pair>dq = new LinkedList<>();
		
		// initially put the first k element index into the dq
		// while new Element is greater then elements in the dq poll from last
		// the intention is that the maximum element would be at the peekFirst
		
		for(int i=0;i<k;i++) {
			
			// remove elements from last 
			while(!dq.isEmpty() && a.get(i) >= dq.peekLast().data ) {
				dq.pollLast();
			}
			
			dq.addLast(new pair(i,a.get(i)));
			
		}
		
		ans.add(dq.peek().data);
		
		for(int i=k;i<a.size();i++) {
			
			// remove the first elements so as to retain the window size
			while(!dq.isEmpty() && i-k>=dq.peek().index) {
				dq.pollFirst();
			}
			
			
			// whenever we get smaller element in dq than current we remove from last
			// and add next element at the last of dq
			while(!dq.isEmpty() && a.get(i) >= dq.peekLast().data ) {
				dq.pollLast();
			}
			
			dq.addLast(new pair(i,a.get(i)));
			
			ans.add(dq.peekFirst().data);
		}
		
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int k = 2;
		for(int x:arr) {
			list.add(x);
		}
		ArrayList<Integer>ans = swm(list,k);
		System.out.println(ans);
	}

}

