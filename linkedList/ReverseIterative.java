/*  
 
		REVERSE THE LINKED LIST ITERATIVELY
		1. Take a curr node ponting head
		2. Take a prev node pointing null        => after list is reversed this null would be the one pointing by the tail
		3. while curr != null 
		   i.   Take a temp node storing the next of current 
		                                                    ( Reason : when current is pointed to previous then the link of the next would be broken 
		           											thus to prevent from losing link we use temp )
		   ii.  current . next = prev   ( First item is reversed )
		   iii. next pointer is broken with the former one 
		   iv.   previous = current      ( previous value is incremented )
		   v.  Thus put current = temp   ( because temp is the next of current .... iteration is done here )
   */


package linkedList;
public class ReverseIterative {
	public static void main(String[]args) {
		// Created list and linked
		node n1 = new node(10);
		node n2 = new node(20);
		node n3 = new node(30);
		node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		node tail = tail(head);    // getting the tail of the list
		
		
		System.out.println("Original : ");
		print(head);
		
		System.out.println("Reversed : ");
		// After the list is reversed the  head becomes the last i.e. Tail
		Reverse(head);
		print(tail);

	}
	
	// Function to reverse the list
	static void Reverse(node head) {
		node curr = head;
		node prev = null;
		
		while(curr!=null) {
			node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
	}
	
	//Method used for getting the tail of the List
	static node tail(node head) {
		node tail = null;
		node curr = head;
		while(curr!=null) {
			tail = curr;
			curr = curr.next;
		}
		return tail;
	}
	
	// Created a node
	static class node
	{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	// Print the List
	static void print(node head) {
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

