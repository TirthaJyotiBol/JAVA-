Q13. KADANEs ALGORITHM [maximum sum contigous subarray]

ALGORITHM :
1.Traverse the whole algorithm once 
2. initial sum =0 ; initial max = 0;
3. if the sum after start of loop becomes -ve then make the whole sum as 0 and again start the loop
4. if the sum is > than the max element then put the sum in the max ;




OPTIMISED - it solves the problem in o(n) complexity ; 


code//

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[]a={-5,-4,-2,6,-1};
		int sum =0;
		int max =0;
		for(int i=0;i<a.length;i++){
		    sum = sum+a[i];
		    if(sum<0){
		        sum=0;
		    }
		    if(sum>max){
		        max=sum;
		    }
		    
		}
		System.out.println(max);
	
	
	}
}
