/* 
		1. This is similar to Binary search 
		2. Here we divide the array into 3 parts
		3. (left - mid1) , (mid1 - mid2) , (mid2 - right)
		4. If key is found at mid1 or mid2 then return the key
		5. Search for elements from left to mid1  ;  mid1 to mid2  ; mid2 to right  
  
*/

package Search_and_sorting;

public class Ternary_search {
	public static void main(String[]args) {
		int[]a= {0,10,20,30 ,40,50,60, 70,80,90};
		
		int left=0;
		int right =  a.length-1;
		int key = 220;

		while(left<=right) {

			int mid1 =  left + (right-left)/3;
			int mid2 =  mid1 + (right-left)/3;
			
			// check for first mid
			if(key == a[mid1]) {
				System.out.println(mid1);
				break;
			}
			// check for second mid
			if(key == a[mid2]) {
				System.out.println(mid2);
				break;
			}
			
			// check for 1/3rd part (Left to first mid)
			if(key<a[mid1]) {
				right = mid1 - 1;
			}
			
			
			// check for the last part (second mid to right)
			else if(key>a[mid2]) {
				left = mid2 + 1;
			}
			
			
			// check if the key is in between first mid and second mid
			else {
				left =  mid1;
				right = mid2;
			}	
		}
	
	}

}
