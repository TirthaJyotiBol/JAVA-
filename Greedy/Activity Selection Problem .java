package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_problem {

	public static void main(String[] args) {
		int N = 4;
		int start[] = {1, 3, 2, 5};
		int	end[] = {2, 4, 3, 6};
		int ans = activitySelection(start,end,N);
		System.out.println(ans);

	}
	
	 public static int activitySelection(int start[], int end[], int n)
	    {
	        activity[]arr = new activity[n];
	        
	        for(int i=0;i<n;i++){
	           arr[i] = new activity(start[i],end[i]);
	        }
	        
	        Arrays.sort(arr,new MyCmp());
	        int count = 1;
	        int prev = 0;
	        for(int curr=1;curr<arr.length;curr++){
	          if(arr[curr].start > arr[prev].end ){
	              count++;
	              prev = curr;
	          }
	        }
	        return count;
	    }
	    
	    static class activity{
	        int start;
	        int end;
	        activity(int start,int end){
	            this.start = start;
	            this.end = end;
	        }
	    
	  }
	  
	  static class MyCmp implements Comparator<activity>
	{
		public int compare(activity a1, activity a2)
		{
			return a1.end - a2.end;
		}
	}

}
