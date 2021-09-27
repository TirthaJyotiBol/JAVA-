// 0th index
package linkedList;
import linkedList.creation.node;
public class Insertion {
	public static void main(String[] args) {
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node head = n1;
			
		head.next = n2;
		n2.next = n3;
		n3.next = null;

		insert(69,2,head);
		traverse(head);
	}
	
	static class node{
		node next;
		int data;
		node(int data){
			this.data=data;
		}
	}
	
	static void insert(int data , int pos , node head) {
		// create a new node
		node toAdd = new node(data);
		
		if(pos == 0) {
			toAdd.next = head;    // linked the current new node to the current 0th pos node  -> Broken the old link
			head = toAdd;         // head is referred to the new node  -> Referred Head to the new Node
			return;
		}
		
		// Take a previous pointer to Traverse upto the position		
		node prevPointer = head;
		
		for(int i=0; i<pos-1 ;i++) {
			prevPointer = prevPointer.next;
		}
		toAdd.next = prevPointer.next;
		prevPointer.next = toAdd;
	}
	
	static void traverse(node head) {
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

}
