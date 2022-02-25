/*
  Q. Given an array : Find the Water that can be stored in the particular gaps
 
 Algo :
   1. Take 2 auxiliary arrays :- Left and Right
   2. Left Max using prepossing
   3. Right Max using prepossing
   4. AnsArray[i] = Math.min(left[i],right[i]) - a[i]
 
  */

package Revision;
public class Rain_Water_Problem {

	public static void main(String[] args) {
		int[]a = {3,1,2,4,0,1,3,2};
		int ans = RWT(a);
		System.out.println(ans);
	}
	
	static int RWT(int[]a) {
		int [] left = new int[a.length];
		int []right = new int[a.length];
		
// Left Processing
		int i = 1;
		left[0] = a[0];
		while(i<a.length) {
			left[i] = Math.max(a[i], left[i-1]);
			i++;
		}
		
// Right Processing
		i = a.length-2;
		right[a.length-1] = a[a.length-1];
		while(i>=0) {
			right[i] = Math.max(right[i+1], a[i]);
			i--;
		}
	
// ans = ans[i] - max(left[i],right[i])  => find the sum 
		int ansArray[] = new int[a.length];
		for(i=0;i<a.length;i++) {
			ansArray[i] = Math.min(left[i], right[i]) - a[i] ;
		}
		
		int ans = 0;
		for(i=0;i<ansArray.length;i++) {
			ans = ans+ansArray[i];
		}
		
		return ans;
	}
	

}
