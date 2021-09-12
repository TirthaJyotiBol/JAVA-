// sort the array in 0(1) space 
// using recursion we divided the array into parts
// Leap of faith -> there would be moment of array is divided into 2 sorted parts
// Now use Shell's Algorithm / Gap's Algorithm to merge the 2 sorted arrays



package Search_and_sorting;
public class inPlaceMergeSort {
	public static void main(String[]args) {
		int[]a = {5,7,9,1,0,3,6,5,8};
		sort(a,0,a.length-1);
		printArr(a);
		
	}
	
	static int nextGap(int gap) {
		if(gap<=1)return 0;
		return (int)Math.ceil(gap/2.0);
	}
	
	static void sort(int[]a,int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			sort(a,low,mid);
			sort(a,mid+1,high);
			inPlaceMerge(a,low,mid,high);
		}
	}
	
	
	static void inPlaceMerge(int[]a,int low,int mid,int high) {
		
		int gap = high - low +1;
		for(gap = nextGap(gap);gap>0 ; gap = nextGap(gap) ) {
			// a window made 
			for(int i = low ; i+gap <=high ; i++) {
				int j = i+gap;
				if( a[i]> a[j] ) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	static void printArr(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
