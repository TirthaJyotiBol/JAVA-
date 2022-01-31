package Revision;
import Revision.LL1_CreateLinkedList.node;;
public class LL6_ReverseList {

	public static void main(String[] args) {
		node head = new node(1);
		node n1 = head;
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;

		print(head);
		
		node h = recursive(head);
		print(h);
	}

// Recursive way to reverse a linked list	
	static node recursive(node head) {
		if(head==null || head.next == null) {
			return head;
		}
		
		node newHead = recursive(head.next);		// gives the last element in the list
		node headNext = head.next;
		headNext.next = head;
		head.next = null;
		
		return newHead;
	}
	
	static void print(node head) {
		if(head == null) return;
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	

}
