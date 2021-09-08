/*	
      T => O(nlogn)    S => O(n)
      MERGE SORT WITHOUT USING EXTRA - SPACE
      
      1. Method  mergeSort() => divides the array into subparts recursively ; until single element lefts
      2. merge() => Method is used to sort Each array and as a result the whole array gets sorted
      3. We donot need to think of the whole Recursive Tree : RECURSIVE LEAP OF FAITH  
*/



package Search_and_sorting;
public class MergeSort {
	public static void main(String[] args) {
		int a[] = {9,8,7,6,5,4,3,2,1};
		System.out.println("Orininal Array : ");
		printArr(a);
		
		System.out.println("Sorted : ");
		mergeSort(a,0,a.length-1);
		printArr(a);

	}
	
	// This Basically divides the array into parts until only 1 element is left
	// Makes a Recursive Tree
	
	static void mergeSort(int a[],int low,int high) {
		//This ensures that there should be atleast 1 element
		
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(a,low,mid);    // First Half
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);    // It  puts the element at correct position i.e. Sorts
			
		}
	}
	
	// Method used to sort the Array
	static void merge(int[]a,int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		// size of left Array and right Array ->Auxialary
		
		int left[] = new int[n1];
		int right[] = new int[n2];

		// Fill the left and right auxialary arrays
		for(int i=0;i<left.length;i++) {
			left[i] = a[low+i];
		}
	    for(int i=0;i<right.length;i++) {
	    	right[i] = a[mid+1+i];
	    }
	    // Now basically use the Technique of Merge 2 sorted Arrays using extra space
	    
	    int i =0;  // Left
	    int j = 0; // Right
	    int k = low;  // k is for putting element into the main Array
	    
	    while(i<left.length && j<right.length ) {
	    	if(left[i] <= right[j] ) {
	    		a[k] = left[i];
	    		k++;
	    		i++;
	    	}
	    	else {
	    		a[k] = right[j];
	    		k++;
	    		j++;
	    	}
	    }
	    
	    // put all the leftovers
	    
	    if(i>=left.length) {
	    	// if i exceeds that means there is leftovers in right array
	    	while(j< right.length) {
	    		a[k] = right[j];
	    		k++;
	    		j++;
	    	}
	    	
	    } else {
	    	while(i< left.length) {
	    		a[k] = left[i];
	    		i++;
	    		k++;
	    	}
	    }  
	}
	
	// Method used to print Array
	static void printArr(int[]a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	
}
