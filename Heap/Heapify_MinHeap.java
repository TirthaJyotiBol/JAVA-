package Heap;

public class Heapify_MinHeap {

	public static void main(String[] args) {
		int[]a = {19,15,20,10,17,25,30};
		heap(a,a.length-1);
		
		for(int i:a)System.out.print(i+" ");
	}
	
	static void heap(int[]a,int n) {
		for(int i=n/2;i>=0;i--) {
			heapify(a,i,n);
		}
	}
	
	static void heapify(int[]a,int i,int n) {
		int smallest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if(left<=n && a[left] < a[smallest] ) {
			smallest = left;
		}
		if(right<=n && a[right] < a[smallest] ) {
			smallest = right;
		}
		
		if(i!=smallest) {
			swap(a,i,smallest);
			heapify(a,smallest,n);
		}
		
	}
	
	static void swap(int[]a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
