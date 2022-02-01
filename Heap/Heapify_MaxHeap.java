package Heap;

public class Heapify_MaxHeap {

	public static void main(String[] args) {
//		int[]a = {20,10,30,5,50,40};
		int[]a = {40,20,30,5};
		
		heap(a,a.length-1);
		
		for(int i:a)System.out.print(i+",");
	}
	
	
	static void heap(int[]a,int n) {
		for(int i=n/2;i>=0;i--) {
			heapify(a,i,n);
		}
	}
	
	static void heapify(int[]a,int i,int n) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<=n && a[left]>a[largest]) {
			largest = left;
		}
		
		if(right<=n && a[right]>a[largest]) {
			largest = right;
		}
		
		if(i!=largest) {
			swap(a,i,largest);
			heapify(a,largest,n);
		}
		
	}
	
	static void swap(int[]a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
