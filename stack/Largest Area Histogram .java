/*
  1. Find the Next Smaller Element index -> n[s]
  2. Find the Previous Smaller element index -> p[s]
  3. use a loop to find the Largest Area Histogram => (n[i] - p[i] - 1)* hist[i]
  */

package stack;
import java.util.Stack;
public class LargestAreaHistogram {
	public static void main(String[]args) {
		long[]a = {7 ,2 ,8, 9, 1, 3, 6, 5};
		
		long max = Solution.getMaxArea(a, a.length);
		System.out.println("Largest Area Histogram : "+max);
	}
}

 class Solution
{
   static long getMaxArea(long hist[], long n) 
    {
        int[]ps = new int[hist.length];
        int[]ns = new int[hist.length];
        
      //previous smaller element index
        Stack<Integer>stk1 = new Stack<>();
        ps[0] = -1;
        stk1.push(0);
        int i = 0;
        for(i=1;i<hist.length;i++){
            
            while(!stk1.empty() && hist[stk1.peek()]>hist[i] ){
                stk1.pop();
            }
            
            if(stk1.empty()){
                ps[i] = -1;
            }
            
            else{
                ps[i] = stk1.peek();
            }
            
            stk1.push(i);
        }
        
        
        
    //Next smaller element index
        Stack<Integer> stk = new Stack<>();
        ns[hist.length-1] = hist.length-1;
        stk.push(hist.length);
        
        for(i=hist.length-2;i>=0;i--){
        	
            while(stk.size()>0 && hist[stk1.peek()] > hist[i]){ 
        		stk.pop();
            }
            
            if(stk.size()==0){
                ns[i] = hist.length;
            }
            else{
                ns[i] = stk.peek();
            }
            
            stk.push(i);
        }  
        
        
        
        // code
        long maxArea = hist[0];
        for(i = 0 ;i<hist.length;i++){
            maxArea = Math.max(maxArea,(ns[i]-ps[i]-1)*hist[i] );
        }
        
        return maxArea;
    }   
}
