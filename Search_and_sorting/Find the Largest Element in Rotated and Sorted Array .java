		/* Find the largest element in a rotated and sorted Array 
   
  
  eg. -> 4 5 6 7 8 1 2 3
  
  1. In all the cases the Greatest element would be at the UNSORTED part of the array
  2. If a[ low ] < a[ mid ] => left part is sorted , search in the right part
  3. If a[ mid ] < a[ high ] => Right hand is sorted , search in the left part
  4. If( a[mid] > a[mid+1]  && a[mid] > a[mid-1]   => then return the element
  
  This is the main Algorithm -> others are the base cases
  
    
    
      */

package Search_and_sorting;
public class Find_Pivot {
	public static void main(String args[]) {
		int[]a = {3,4};
		int pivotIndex = pivot(a , 0 , a.length-1);
		
		System.out.println(pivotIndex);    // index of Largest element
		System.out.println(a[pivotIndex]); // Largest element
		
		int timesRotated = 0;
		if(a[0] > a[a.length-1]){
			timesRotated = pivotIndex+1;
		}
		
		System.out.println("Number of times array rotated : "+ (timesRotated));
		
	}
	
	static int pivot(int[]a , int low , int high) {
		if(low == high) 
			// If only 1 element is present in array then return that
			return low;
		
		if(a[low] < a[high]) {
			// If array is sorted return the last element
			return high;
		}
		
		
		while(low<=high) {
		
		int mid = (low + high)/2 ;
		if(a[mid] > a[mid-1]  && a[mid]>a[mid+1]) {
			return mid;
		}
		if(a[low] < a[mid]) {
			// Left part is sorted , search in right unsorted part
			low = mid + 1;
		}
		
		if(a[mid] < a[high]) {
			// Right part is sorted , search in the left unsorted part
			high = mid;
		}
		
		}
		return -1;
		
	}

}
