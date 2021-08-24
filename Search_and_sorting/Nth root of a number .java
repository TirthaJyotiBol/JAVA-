/*
		1. Create an array of size same as the number ( num=3 ; a[]={1,2,3}  )
		2. Create a function that would find Nth power of number
		3. Use binary search in the array
		 		searchElement = NthPower(a[mid],N)     -> this would give us the Nth power of the middle element
		4. If searchElement > num    => Discard the right part , search at the left part
		5. If searchElement < num    => Discard the left part , search at the right part 
 		6. If element is not found then return -1
 
*/


package Search_and_sorting;
public class Nth_root_of_integer {
	public static void main(String[] args) {
		System.out.println(NthRoot(4,2));  					// square root of 4

	}
	
	
	/* it would return nth root of the number num */
	public static int NthRoot(int num, int n) {
		int []a=new int[num];						// (if num=3 it would create an array 1,2,3)
		for(int i=0;i<num;i++) {
			a[i]=i+1;
		}
		
		int low=a[0];
		int high=a[num-1];
		
		while(low<=high) {
			int mid=(low+high)/2;
			int search = inc(a[mid],n);
			if(search==num) {
				return a[mid];
			}
			if(search>num) {
				high=mid-1;
			}
			if(search<num) {
				low=mid+1;
			}
			
		}
		
		
		return -1;
	}
	
	
	
	
	/*   This would return the nth power of num (square,cube,4thpower etc...)
	     If num =3 , and  n=2 ; it would return 9 [square of 3]    */
	public static int inc(int num,int n) {
		int ans=1;
		int i=0;
		while(i<n) {
			ans=ans*num;
			i++;
		}
		return ans;
	}
	

}
