package linkedList;
public class MidElement {
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
		Mid(head);	
	}
  
  // Finds the middle element
	static void Mid(node head) {	
		node fast = head;
		node slow = head;
		node tail = head;
		
		//base case
		if(fast.next == null || fast.next.next ==null) {
			System.out.println("no mid element");
		}
		if(fast.next.next.next == null) {
			System.out.println(fast.next);
		}
		while(tail.next!=null) {
			tail = tail.next;
		}
		while(fast.next!=tail && fast!=tail) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}
	
	static class node {
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
