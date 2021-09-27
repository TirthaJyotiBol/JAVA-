package linkedList;
public class DetectLoop_floydCircleAlgo {
	public static void main(String[]args) {
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node n4 = new node(50);
		node head = n1;
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;	
		
		if(LoopDetecter(head)) {
			System.out.println("Loop is present");
		}
		else
		System.out.println("No loop Found");
	}
	
	static boolean LoopDetecter(node head) {
		boolean isFound = false;
		node temp = head;
		node slow = temp;
		node fast = temp.next;

		while(temp!=null) {
			if(slow == fast) {
				isFound = true;
				break;
			}
			if(fast.next == null) {
				isFound = false;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
			temp = temp.next;
		}
		
		return isFound;
	}
	
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
}
