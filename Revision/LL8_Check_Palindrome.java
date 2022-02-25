package Revision;

public class LL8_Check_Palindrome {

	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	
	static boolean isPalindrome(node head) {
		node curr = head;
		node mid = mid(head);
		node last = reverse(mid.next);
		
		while(last!=null) {
			if(last.data != curr.data) {
				return false;
			}
			last = last.next;
			curr = curr.next;
		}
		return true;
	}
	
	
	static node mid(node head) {
		node slow = head;
		node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	static node reverse(node head) {
		if(head == null) return null;
		node curr = head;
		node prev = null;
		while(curr!=null) {
			node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	static void print(node head) {
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		node head = new node(1);
		node n1 = new node(2);
		node n3 = new node(352);
		node n4 = new node(2);
		node n5 = new node(1);
		
		head.next = n1;
		n1.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println(isPalindrome(head));
		
	}

}












