/* 
 Given a Min Heap => Convert the minheap into maxheap
 */

package Heap;
public class MinHeap_to_MaxHeap {

	public static void main(String[] args) {
		int[]minHeap = {1,2,3,4,5,6,7};
		print(minHeap);
		
		maxHeap(minHeap,minHeap.length-1);
		print(minHeap);
		
	}
	
	static void maxHeap(int[]a,int n) {
		for(int i = n/2;i>=0;i--) {
			heapify(a,i,n);
		}
	}
	static void heapify(int[]a,int i,int n) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if(left <= n && a[left]>a[largest] ) {
			largest = left;
		}
		
		if(right <= n && a[right] > a[largest] ) {
			largest = right;
		}
		
		if(i!=largest) {
			swap(a,largest,i);
			heapify(a,largest,n);
		}
		
	}
	
	static void print(int[]a) {
		for(int i:a)System.out.print(i+" ");
		
		System.out.println();
	}
	static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
