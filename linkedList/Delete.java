package linkedList;
public class Delete {
	public static void main(String[]args) {
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node n4 = new node(40);
		node head = n1;
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
	
		System.out.println("Original");
		traverse(head);
		
		delete(0,head);
		
		System.out.println();
		System.out.println("New ");
		traverse(head);
	}
	
	  static void delete(int pos, node head) {
		  
		  if(pos == 0) {
			  head = head.next;
		  }
		  
			node prev = head;
			for(int i=0;i<pos-1;i++) {
				prev = prev.next;
			}
			
			prev.next = prev.next.next;
			
		}
	  
		// Creation of a node
	static class node{
		node next;
		int data;
		node(int data){
		this.data = data;
	}
}
	  
	static void traverse(node head) {
		node curr = head;
	    while(curr!=null) {
	    System.out.print(curr.data+" ");
	    curr = curr.next;
	}
}	

}
