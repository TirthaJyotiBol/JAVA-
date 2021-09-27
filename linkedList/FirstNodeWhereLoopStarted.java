package linkedList;
public class FirstNodeWhereLoopStarted {
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
		n6.next = null;
		
		System.out.println(LoopDetect(head));
		System.out.println(LoopStart(head).data);
	}
	
	
	// Detect whether a loop is present or not 
	// if present then returns the point where fast and slow pointer meet
	static node LoopDetect(node head) {
		node slow = head;
		node fast = head;
		node temp = head;
		while(temp!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return slow;
			}
			if(fast.next.next == null) {
				return null;
			}
		}
		return null;
	}
	
	// It returns the first node where loop started
	// take start => head and meet => where start and end meet
	// increment both until the start and the meet intersects
	// The point where the intersects is the node where the loop started
	static node LoopStart(node head) {
		node start = head;
		node meet = LoopDetect(head);
		while(start != meet) {
			start = start.next;
			meet = meet.next;
		}
		return start;
}
	
	
	// Node
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	// Traverse
	static void traverse(node head) {
		System.out.println("The list is : ");
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
