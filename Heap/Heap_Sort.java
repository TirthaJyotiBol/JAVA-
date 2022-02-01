package Heap;

public class Heap_Sort {

	public static void main(String[] args) {
		int[]a = {20,10,30,5,50,40};
		int n = a.length-1;
		
		heapSort(a,n);
		print(a);
		
	}
	
	static void heapSort(int a[],int n) {
	// step 1 => Build a max heap
		buildMaxHeap(a,n);						
	
	// step 2 => Swap the 0th element with the last element each time and heapify the array
		for(int i=n;i>=0;i--) {
			swap(a,0,i);
			heapify(a,0,i-1);
		}
	}
	
	static void buildMaxHeap(int[]a,int n) {
		for(int i=n/2;i>=0;i--) {
			heapify(a,i,n);
		}
	}
	
	static void heapify(int[]a,int i,int n) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<=n && a[left] > a[largest] ) {
			largest = left;
		}
		if(right<=n && a[right]>a[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			swap(a,largest,i);
			heapify(a,largest,n);
		}
		
	}
	
	static void swap(int[]a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void print(int[]a) {
		for(int i:a) System.out.print(i+" ");
		
		System.out.println();
	}

}
