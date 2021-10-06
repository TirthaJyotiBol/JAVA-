/*

  1. Find the middle element3
  2. Reverse the list starting from mid.next
  3. compare the start and last elements 
       if any element doesnot match then return false
*/
package linkedList;
public class Palindrome {
	public static void main(String[]args) {
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(2);
		node n5 = new node(1);
		node head = n1;
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
    
		System.out.println(isPalindrome(head));
		
	}
	static boolean isPalindrome(node head) {
		if(head == null) {
			return true;
		}
		node mid = mid(head);                // mid element
		node last = reverse(mid.next);       // Reverses the list after mid and returns the Tail
		node start = head;				     // start of the list
		while(last!=null) {
			if(last.data != start.data)      // if data doesnot matches that means its not palindrome
      {
				return false;
      }
			last = last.next;
			start = start.next;
		}
		return true;
	}
	
	// step 1 => find the middle element
	static node mid(node head) {
		node fast = head;
		node slow = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	// step 2 => Reverse the Linked list 
	static node reverse(node head) {
		node prev = null;
		node curr = head;
		while(curr!=null) {
			node Next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = Next;
		}
		return prev;
	}
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static void print(node head) {
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
