/* 
  	This is a normal binarysearch with a modified version
  	# In case of binary search if any element is found we only return the index
  	but here we need to return the first and last index
  	
  	First Index ->
  			1. As soon as we find the element then store it at a temp variable
  			2. Search for the same element before the current index  (i.e. searching if this element is present before for first index)
  			3. If element is found the Update the index
  			4. Else Current index is the first element
  			
  	Last Index ->
  			1. As soon as the element is found then store at another temp variable
  			2. Search for the same element after the current index -> higher index
  			3. If this element is found at higher index then update the temp
  			4. Else return the current index
  	
 */

package Search_and_sorting;
import java.util.*;
public class firstAndLastOccurance {
	public static void main(String[]args) {
		ArrayList<Integer>list=new ArrayList<>();
		int[]a = {1,2,2,2,2,3,3,3,5,6,7,8,8,8,18};
		list=findIndex(a,18);
		System.out.println(list);
		
	}
	
	public static ArrayList<Integer> findIndex(int[]a,int search){
		ArrayList<Integer>list = new ArrayList<>();
		int low=0;
		int high=a.length-1;
		//if element is not found then it would return -1
		int first=-1;    
		int last=-1;
		
		
		/*search for first index*/
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==search) {
				first=mid;
				high=mid-1;     // since we want to find first index thus search for if the element is present before
			}
			if(search>a[mid]) {
				low=mid+1;
			}
			if(search<a[mid]) {
				high=mid-1;
			}
		}
		list.add(first);
		
		
		/*The value of low and high might change for the loop above , thus we again update this*/
		low=0;
		high=a.length-1;
		/*Sesrch for the last  index*/
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==search) {
				last=mid;
				low=mid+1;			// since we want to find last index thus search for if the element if also present after the current index
			}
			if(search>a[mid]) {
				low=mid+1;
			}
			if(search<a[mid]) {
				high=mid-1;
			}
		}
		
		list.add(last);
		
		
		return list;
	}
}
