package Revision;

public class SAS2_count {


	public static void main(String[] args) {

		int[]a = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
		int e = 1;
		

		int low = 0;
		int high = a.length-1;
		int res = -1;
		
		// first occurance 
		while(low <= high) {
			int mid = (low +(high - low)/2 );
			if(a[mid] == e ) {
				res = mid;
				high = mid - 1;
			}
			else if(e > a[mid] ) {
				low = mid + 1;
			}
			else {
			    high = mid - 1;	
			}
		}
	
		int fo = res;
		
		
		// last occurance 
		low = 0;
		high = a.length - 1;
		res = -1;
		
		while(low <= high) {
			int mid = (low +(high - low)/2 );
			if(a[mid] == e ) {
				res = mid;
				low = mid + 1;
			}
			else if(e > a[mid] ) {
				low = mid + 1;
			}
			else {
			    high = mid - 1;	
			}
		}
		
		int lo = res;
		
		if(fo ==-1 && lo == -1) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(lo - fo + 1);
		
	}

}
