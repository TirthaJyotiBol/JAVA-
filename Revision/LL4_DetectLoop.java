package Revision;
import Revision.LL1_CreateLinkedList.node;
public class LL4_DetectLoop {

	public static void main(String[] args) {
		node head = new node(1);
		node n1 = new node(2);
		node n2 = new node(3);
		node n3 = new node(4);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n2;
		
		System.out.println(detect(head));
		
	}
	
	/* use fast and slow pointer to detect loop */
	static boolean detect(node head) {
		if(head == null) return false;
		node slow = head;
		node fast = head.next;
		while(true) {
			if(slow == fast) {
				return true;
			}
			if(fast.next==null || fast.next.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
	}

}
