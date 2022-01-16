Bruteforce :

import java.util.*;
public class polit {

	public static void main(String[]args) 
  {
		int[]a= {1,2,3,-4,-5,-6,-7,8};
		int max=Integer.MIN_VALUE;
		int k=3;
		
		int maximum=Integer.MIN_VALUE;
		
		for(int i=0;i<=a.length-k;i++) {
			int max_value=max(a,i,i+k);
			if(max_value>maximum ) {maximum =max_value;}
			System.out.print(max_value+" ");
		}
		
	}
	
	static int max(int[]a,int i,int j) {            // class that gives the maximum value for a particular range 
		int max=Integer.MIN_VALUE;
		for(int p=i;p<j;p++) {
			if(a[p]>max) {max=a[p];}
		}
		
		return max;
	}

}
