/*    

      ALGO -> 
        1. i = 0 , j = 0 => indexing the two sorted arrays
        2. k = 0 => indexing the auxialary array , where we will put the elements
        3. if ( a[i] < b[j] ) put a[i] into the auxialary array and increment i
           if ( b[j] < a[i] ) put b[j] into the auxialary array and increment j
        4. Finally if i doesnot reach a.length-1  or j != b.length -1 
           that means all the elements are not traversed 
        5. Put all the remaining elements into the Auxialary array



*/


package Search_and_sorting;
public class Merge {
	public static void main(String[] args) {
		int []a = {1,10,20};
		int []b = {2,3,5,7};
		
		int aux[]= new int[a.length + b.length];
		int i =0;    // for traversing  "a"
		int j =0;    // for traversing  "b"
		int k =0;    // for traversing the Auxialary array
		
		while(i< a.length && j< b.length) {
			
      // if element in array "a" is less than element in array "b" then put the aux array with a[i]
			if(a[i] < b[j]) {
				aux[k] = a[i];
				i++;
			}
			
			else {
        // if b[i] > a[i]  then put the auxialary Array with element of b and then increment b index
				aux[k] = b[j];
				j++;
			}
			
			k++;
			
		}
		
		if(i>= a.length) {
			while(j<b.length) {
				aux[k] = b[j];
				k++;
				j++;
			}
			
		}
		if(j>=b.length) {
			while(i<a.length) {
				aux[k] = a[i];
				k++;
				i++;
			}
		}
		
    
    
    // Print the sorted Array
		for(int x: aux) {
			System.out.print(x+" ");
    }
	   
    }
}
