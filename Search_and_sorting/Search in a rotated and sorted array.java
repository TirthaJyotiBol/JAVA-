/*
  
  		LEFT PART -> low to mid-1 
  		RIGHT PART-> mid+1 to high
  
 
 		1. If a[low] < a[mid] -> low to mid part is sorted  (left part is sorted)
 		2. If a[low] > a[mid] -> mid to high part is sorted (right part is sorted)
 		3. If left part is sorted 
 		 		if    a[low] < target < a[mid]  then => search at the left part         
 		        else  search at right part 
 		          
 		4. If right part is sorted
 				if  a[mid] < target < a[high] then => search at right part
 				else seatch at left part
 */


package Search_and_sorting;
public class search_in_rotated_and_sorted_array {
	public static void main(String[]args) {
		int[]a= {2,3};
		int target=2;
		System.out.println(search(a,target));
		
	}
	
	public static int search(int[]a,int target) {
		int low=0;
		int high=a.length-1;
	
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(a[mid]==target) {
				return mid;
			}
			
			// check if the left part is sorted
			if(a[low]<a[mid]) {
				// check if the element is present at the left part
				if(a[low]<=target && target<a[mid]) {
					high=mid-1;								// search at the left part
				}
				else {
					low=mid+1;								// search at the right part
				}
				
			}
			
			else {
				if(target>a[mid] && target<=a[high]) {
					low=mid+1;									// if yes then search at the right part
				}
				else {
					high=mid-1;									// else search at left part
				}
			}
		}
		
		return -1;
	}

}
