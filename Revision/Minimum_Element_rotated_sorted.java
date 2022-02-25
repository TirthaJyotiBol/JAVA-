package Revision;

public class Minimum_Element_rotated_sorted {

	public static void main(String[] args) {
		int[]a = {5,6,7,8,1,2,3,4};
		int ans = minElement(a,0,a.length-1);
		
		System.out.println(ans);

	}
	
	static int minElement(int[]a,int low,int high) {
		
		if(a[low] < a[high] || low == high ) {
			return a[low];
		}
		
		
		
		while(low <= high) {
			
			int mid = (low+high)/2;
			
			if((a[mid] < a[mid-1]) && (a[mid] < a[mid+1] ) ) {
				return a[mid];
			}
			
			if(a[low] < a[mid] ) {
				return minElement(a,mid+1,high);		// lower part sorted : search in higher part  
			}
			
			else {
				return minElement(a,low,mid);			// higher part sorted : search in lower part
			}	
			
		
		}
		
		return -1;   // if element not found
	}

}
