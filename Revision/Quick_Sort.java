package Revision;

public class Quick_Sort {

	public static void main(String[] args) {
		int[]a = {2,4,6,2,6,9,8,7,0};

		algo(a,0,a.length-1);
		
		for(int x:a) {
			System.out.print(x+" ");
		}

	}
	
	static void algo(int[]a,int low, int high) {
		
		int mid = partition(a,low,high);
		if(low < mid-1 ) {
			algo(a,low,mid-1);
		}
		
		if(mid < high) {
			algo(a,mid,high);
		}
		
	}
	
	
	static int partition(int[]a,int low,int high) {
	
		int pivot = a[(low+high)/2];
		
		while(low <= high) {
			while(a[low] < pivot ) {
				low++;
			}
			while(a[high] > pivot ) {
				high--;
			}
			
			if(low<=high ) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
			}
		}
		
		return low;
	}

}
