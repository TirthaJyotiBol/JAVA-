package Revision;
import Revision.LL1_CreateLinkedList.node;
public class LL5_deleteLoop {

	public static void main(String[] args) {
		node head = new node(1);
		node n1 = new node(2);
		node n2 = new node(3);
		node n3 = new node(4);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n2;
		
		delete(head);
		LL1_CreateLinkedList.print(head);

	}
	
	// point.next = null -> breaks the loop
	static void delete(node head) {
		node meetPoint = meetPoint(head);
		node temp = head;
		while(temp!=meetPoint) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	// Gets the point after which the loop starts
	static node meetPoint(node head) {
		if(head == null) return null;
		node slow = head;
		node fast = head;
		
		while(true) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return slow;
			}
			if(fast.next.next == null || fast.next == null) {
				return null;
			}
		}
	}

}
