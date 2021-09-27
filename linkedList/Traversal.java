package linkedList;
public class Traversal {
	public static void main(String[]args) {
		// Created nodes
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node n4 = new node(40);
		node head = n1;
		
		// Created link
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		traverse(head);	
	}
	
	
	// Created the node
	static class node {
		node next;
		int data;
		
		node(int data){
			this.data = data;
		}
	}
	
	
	// Traversal method using linked list
	static void traverse(node head) {
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

}
