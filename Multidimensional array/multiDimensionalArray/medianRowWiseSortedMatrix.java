package multiDimensionalArray;

import java.util.Arrays;

public class medianRowWiseSortedMatrix {
	

	static int countElements(int[]a,int mid) {
		int low = 0;
		int high = a.length-1;
		while(low<=high) {
			int row_mid= low+high/2;
			
			if(a[row_mid]<=mid) { low = mid+1;}
			else {high =mid-1;}
		}
		return low;
	}
	
	public static void main(String[]args) {
		int a[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
		
		int high =Integer.MAX_VALUE;	  // lowest element
	    int low=Integer.MIN_VALUE;       //highest element
	    int n =a.length;    
	    int m = a[0].length;          //size of rows and columns
	    
	    
	    
//	    for(int i=0;i<n;i++) {
//	    	if(a[i][0]<low) {low=a[i][0];}
//	    }
//	    
//	    for(int i=0;i<m;i++) {
//	    	if(a[0][m]>high) {high=a[0][m];}
//	    }
	    
	    
	    
	    int desired = (n*m)/2;          
	   
	    
	    /*
	     * the median would be [(n*m+1)/]2th  element ; 
	     * if our element count is lesser then this we need to shift right
	     * else shift left 
	     * */
	    
	    while(low<=high)
	    {
        	int mid = (low+high)/2;
		    int count =0;                //count elements number less then the current
		    
     
	    for(int i=0;i<n;i++) {       
	    	/*
	    	 * for each row count the elements number less than the mid
	    	 * */
	    	count = count + Arrays.binarySearch(a[i],mid);
	    }
	    
	    
	    if(count<=desired) {low = mid+1;}
	    else {high = mid-1;}
	    
	    }
	    System.out.println("Median is : "+low);

	}
	
	
	

}
