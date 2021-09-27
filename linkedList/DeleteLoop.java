package linkedList;
public class DeleteLoop {
	public static void main(String[]args) {
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node n4 = new node(40);
		node n5 = new node(50);
		node n6 = new node(60);
		node head = n1;
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n2;
		
		System.out.println("Here the loop is started");
		deleteLoop(head); 
		traverse(head);
		
	}
	
	// Detects loop and returns the node where slow and fast meet
	static node detectLoop(node head) {
		node slow = head;
		node fast = head;
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}	
	
	static void deleteLoop(node head) {
		node meet = detectLoop(head);
		node start = head;
		node temp = meet;
		while(start!=meet) {
			start = start.next;
			meet = meet.next;
			if(start.next == meet.next) {
				temp.next = null;          // Link is broken
			}
		}
	}
	
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static void traverse(node head) {
		System.out.println("The list is : ");
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
