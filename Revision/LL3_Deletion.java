package Revision;
import Revision.LL1_CreateLinkedList.node;
public class LL3_Deletion {

	public static void main(String[] args) {
		node headTemp = LL1_CreateLinkedList.create(5);
		node head = deleteHead(headTemp);
		deleteLast(head);
		deleteMid(head);
		LL1_CreateLinkedList.print(head);
	}
	
	/* Delete the Head Element  */
	static node deleteHead(node head) {
		if(head == null) return null;
		head = head.next;
		return head;
	}

	/* Delete the Last Element */
	static void deleteLast(node head) {
		node curr = head;
		while(true) {
			if(curr.next.next == null) {
				break;
			}
			curr = curr.next;
		}
		
		curr.next = null;
	}
	
	
	/* Delete the Mid Node */
	static void deleteMid(node head) {
		node slow = head;
		node fast = head;
		node temp = null;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			temp = slow;
			slow = slow.next;
		}
		
		temp.next = temp.next.next;
	}
	
}






