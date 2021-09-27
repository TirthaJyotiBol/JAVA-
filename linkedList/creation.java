package linkedList;

public class creation {
	public static void main(String[]args) {
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		
		// First node is made head
		node head = n1;
		
		// Create links
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		
		System.out.println(head.data);				// Data of head node
		System.out.println(head.next.data);			// Data of the next node of Head	
	}
	
	
	// class became a data type
	// creation of a node
	static class node{
		node next;
		int data;
		
		node(int data){
			this.data = data;
		}
	}
}
