/*
 Q. If there exists overlapping intervals then Merge them
   
    1. Sort the Intervals on the basis of first element using comparator Interface 
            (Since its an interface : we directly cant use it we need to use another class)
            
    2. Push the first element into the stack
    
    3. Start traversing from 1st index of array
    
    4. i.  If the start of array (a[i].start) is greater than the top end (top.end) , that means no overlapping : simply push
       ii. If the end of top > start of array => overlap ( use top.start = a[i].end ) : update the top element in the stack
       iii.If the end of array < end of top => the whole a[i] is inside the top element : thus no code
 
  */

package stack;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
public class MergeIntervals {
	public static void main(String[] args) {
		Interval[]a = new Interval[4];
		a[0] = new Interval(1,3);
		a[1] = new Interval(2,4);
		a[2] = new Interval(5,7);
		a[3] = new Interval(6,8);
	
		// call merge interval
		mergeIntervals(a);
	}	
	
	 static void mergeIntervals(Interval a[]) {	
		Stack<Interval> stk = new Stack<>();
		stk.push(a[0]);
		
		
		// sort the array on the basis of 1st element
		Arrays.sort(a, new Comparator<Interval>() {
			public int compare(Interval i1 , Interval i2) {
				return i1.start-i2.start;
			}
		});
		
		
		// push logic
		for(int i=1 ;i<a.length ;i++) {
			Interval top = stk.peek();
			
			// overlapping : update the stack
			if(a[i].start < top.end) {
				top.end = a[i].end;
			}
			
			// no overlapping
			if(a[i].start > top.end) {
				stk.push(a[i]);
			}
			
			if(a[i].end < top.end) {
				// if the a[i] is in between the intervals then do nothing
			}
		}
		
		
		//print intervals
		while(!stk.empty()) {
			Interval t = stk.pop();
			System.out.print("["+t.start+" "+t.end+"] ");
		}
	}
	
}

// created a user defined class for Intervals
class Interval{
	 
	 int start,end;
	Interval(int start , int end){
		this.start = start;
		this.end = end;
	}
	
}

