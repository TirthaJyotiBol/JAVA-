package Revision;

public class SAS3_NumberOfTimesRotated {

	public static void main(String[] args) {
		int[]a = {11,12,15,19,2};
		int high = a.length;
		
		int ind = search_se(a,0,high-1);
		if(ind == -1) {
			System.out.println(-1);
			return;
		}
		int repetations = high - ind;
		System.out.println(repetations);
	}
	
	// index of the smallest element
	static int search_se(int[]a,int low,int high) {
	
		if(a[low] < a[high] || low == high ) return low;
		
		int mid = low + (high - low)/2;
		while(low <= high) {
			
			
			if(a[mid]<a[mid+1] && a[mid]<a[mid-1]) {
				return mid;
			}
			
		    if(a[mid] >= a[low] ) {
				return search_se(a,mid+1,high);
			}
			else {
				return search_se(a,low,mid-1);
			}
			
		}
		
		return -1;
	}

}
