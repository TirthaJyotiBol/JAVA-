package Arrays;
import java.util.*;
public class MergeIntervals {

	public static void main(String[] args) {
		ArrayList<Interval>intervals = new ArrayList<>();
		intervals.add(new Interval(1,2));
		intervals.add(new Interval(3,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(12,16));
		
		Interval newInterval = new Interval(4,9);
		
		intervals = merge(intervals,newInterval);
		
		for(int i=0;i<intervals.size();i++) {
			System.out.print("("+intervals.get(i).start + ","+ intervals.get(i).end+")");
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
	
	static ArrayList<Interval> merge(ArrayList<Interval>intervals,Interval newInterval) {
		
		// base
		if(intervals.size() == 0 || intervals == null) {
			intervals.add(newInterval);
			return intervals;
			
		}
		
		
		int i = 0;
		Interval toInsert = newInterval;
		while(i<intervals.size()) {
			
			Interval curr = intervals.get(i);
			
			if(curr.end < toInsert.start ) {
				i++;
				continue;
			}
			
			else if(toInsert.end < curr.start ) {
				intervals.add(i,toInsert);
				break;
			}
			
			else {
				// where overlapping occurs :
				
				toInsert.start = Math.min(toInsert.start, curr.start);
				toInsert.end = Math.max(toInsert.end, curr.end);
				intervals.remove(i);
				
			}
			
		}
		
		// if last element is reached :
		if(i == intervals.size()) {
			intervals.add(toInsert);
		}
	
		return intervals;
	}

}
