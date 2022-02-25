package Revision;
import java.util.*;
import Revision.LL1_CreateLinkedList.node;
public class LL2_Insertion {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		node temp = LL1_CreateLinkedList.create(5);
		node head = Insertion(temp);
		Last(head);
		Middle(head);
		LL1_CreateLinkedList.print(head);
	}
	
	/* Insertion at the Beginning */
	static node Insertion(node head) {
		if(head == null) return null;
		System.out.println("Enter the element to be inserted : ");
		int data = scan.nextInt();
		node newNode = new node(data);
		newNode.next = head;
		head = newNode;
		
		return head;
	}
	
	/* Insertion at the end */
	static void Last(node head) {
		if(head == null) return;
		node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		System.out.println("Enter the element to be inserted at the end : ");
		int data = scan.nextInt();
		curr.next = new node(data);
		curr.next.next = null;
	}
	
	/* Delete the Middle Element */
	static void Middle(node head) {
		System.out.println("Enter the element to be inserted in the middle : ");
		int data = scan.nextInt();
		node slow = head;
		node fast = head;
		node temp = null;
		
		while(fast.next!=null && fast.next.next!=null ) {
			fast = fast.next.next;
			temp = slow;
			slow = slow.next;
			
		}
		
		node newNode = new node(data);
		newNode.next = temp.next;
		temp.next = newNode;
	}
	

}
