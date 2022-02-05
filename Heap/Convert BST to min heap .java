/*
 Traverse the BST and put it into an array/list
 Convert the list into min Heap / maxHeap
 */

package Heap;
import java.util.*;
public class BST_to_MinHeap {
	
	public static void main(String[] args) {
		System.out.println("Enter the element : ");
		node root = makeBST();
		ArrayList<Integer>bst = new ArrayList<>();
		inorder(root,bst);
		System.out.println(bst);
		
		// convert into minheap
		minHeap(bst,bst.size());
		System.out.println(bst);
	}
	
	// convert BST to Min Heap
	static void minHeap(ArrayList<Integer>a,int n) {
		for(int i = n/2;i>=0;i--) {
			heapify(a,i,n);
		}
	}
	
	static void heapify(ArrayList<Integer>a,int i,int n) {
		int smallest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if(left <= n && a.get(left) < a.get(smallest) ) {
			smallest = left;
		}
		
		if(right <= n && a.get(right)< a.get(smallest) ) {
			smallest = right;
		}
		
		if(i!=smallest) {
			Collections.swap(a, i, smallest);
			heapify(a,smallest,n);
		}
		
	}
	

	// BST
	static class node{
		int data;
		node left;
		node right;
		node(int data){
			this.data = data;
		}
	}
	
	@SuppressWarnings("resource")
	static node makeBST() {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		if(data == -1) {
			return null;
		}
		node r = new node(data);
		System.out.println("Enter the left of "+data);
		r.left = makeBST();
		 
		System.out.println("Enter the right of "+data);
		r.right = makeBST();
		
		return r;
	}
	
	// converts BST into an array
	static void inorder(node root,ArrayList<Integer>list) {
		if(root == null) return ;
		list.add(root.data);
		inorder(root.left,list);
		inorder(root.right,list);
	}
	

}


