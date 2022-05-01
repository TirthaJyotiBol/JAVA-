package Arrays;
import java.util.*;
public class MergeIntervals__Overlapping {

	public static void main(String[] args) {
		ArrayList<Interval>list = new ArrayList<>();
		
		list.add(new Interval(1,3));
		list.add(new Interval(4,5));
		list.add(new Interval(7,13));
		list.add(new Interval(8,9));
		list.add(new Interval(9,17));
		list.add(new Interval(19,25));
		
		list = merge(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print("("+list.get(i).start+","+list.get(i).end+")");
		}
		
	}
	
	static class Interval{
		int start;
		int end;
		Interval(int start,int end){
			this.start = start;
			this.end = end;
		}
	}
	
	static ArrayList<Interval> merge(ArrayList<Interval>intervals){
		if(intervals == null ) {
			return null;
		}
		
		Collections.sort(intervals,(a,b)->a.start-b.start);

		Deque<Interval>dq = new LinkedList<>();
		dq.addFirst(intervals.get(0));
		
		int i = 1;
		while(i<intervals.size()) {
			Interval curr = intervals.get(i);
			if(dq.size()>0 && curr.start > dq.peekLast().end ) {
				dq.addLast(curr);
			}
			else {
				if(dq.size() > 0)
				{
				Interval toInsert = dq.pollLast();
				toInsert.start = Math.min(toInsert.start, curr.start);
				toInsert.end = Math.max(toInsert.end, curr.end);
				dq.addLast(toInsert);
				}
			}
			
			i++;
		}
		
		// since we are returning intervals weclear first and then add all the elements from deque
		intervals.clear();
		while(dq.isEmpty() == false) {
			intervals.add(dq.pollFirst());
		}
		
		return intervals;
	}

}
