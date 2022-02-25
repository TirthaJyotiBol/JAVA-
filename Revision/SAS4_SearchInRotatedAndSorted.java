package Revision;

public class SAS4_SearchInRotatedAndSorted {

	public static void main(String[] args) {
		int[]a = {40,50,90,100,110};
		int key = 40;
		int ans = search(a,0,a.length-1,key);
		System.out.println(ans);

	}
	
	static int search(int[]a,int low,int high,int key) {
		
		while(low<=high) {
			int mid = (low + (high-low/2));
			if(a[mid] == key ) {
				return mid;
			}
			
			// check for the first half as sorted (left sorted)
			if(a[low] < a[mid] ) {
				if(key >= a[low] && key < a[mid] ) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}
			
			// check for the second half as sorted (right sorted)
			else {
				if(key > a[mid] && key <= a[high] ) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}
		}
		
		
		return -1;
	}

}
