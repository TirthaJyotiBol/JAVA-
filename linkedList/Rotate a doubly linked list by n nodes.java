/*	
 Q. Rotate a doubly linked list by N nodes
    
	    1. Make the list as circular
	    2. Move to the (N-1)th node and make the (N-1)th .  next = null 
	        i.e. basically break the circularity 
 	*/



package linkedList;
class RotateDoubly {
	public static void main(String[]args) {
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		node n6 = new node(6);
		node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		
		node tail = n6;
		tail.prev = n5;
		n5.prev = n4;
		n4.prev = n3;
		n3.prev = n2;
		n2.prev = n1;
		n1.prev = null;
		
		System.out.print("Original : ");
		print(head);
		System.out.print("Rotated  : ");
		rotate(head, 1);
		
	}
	
	// Node by n
	static void rotate(node head ,  int n) {
			
		// size of the linked list 
		int size = size(head);
		if(n > size) {
			return;
		}
		
		// find the last element
		node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		
		node temp = head;
		tail.next = temp;     // make the list as a circular linked list
		
		int count = 1;
		node Head = head;   // this is used to move to the last element after which we would rotate
		
		while(true) {
			count ++;
			Head = Head.next; 
			if(count == size - n)
				break;
			
		}
		
		// break the link 
		head = Head.next;
		Head.next = null;

		print(head);
	}
	
	// finds the size of the linked list
	static int size(node head) {
		int size  = 1;
		node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	static class node{
		int data;
		node next;
		node prev;
		node(int data){
			this.data = data;
		}
	}
	static void print(node head) {
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
