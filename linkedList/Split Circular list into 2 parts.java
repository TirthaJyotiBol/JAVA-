/*  problem :  Split a circular Linked List into 2 parts
 
 Algo : 
 		1. Find the last and middle element in the list
 		2. middle.next = null;    : First link is broken
 		3.  last.next = null;     : Last link is broken  
  */

package linkedList;
public class SplitCircular {
	public static void main(String[]args) {
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		node n6 = new node(6);
		node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n1;

		split(head);
	}

	static void split(node head) {
		node first = head;
		node last = head;
		
		// find the last node
		while(last!=null) 
		{
			if(last.next == first ) {
				break;
			}
			last = last.next;
		}
		
		// find the middle node
		first = head;
		node mid = head;
		while( first!=last && first.next != last) 
		{
			first = first.next.next;
			mid = mid.next;
		}
		
		// since link to be broken thus we keep the link at a safe place
		node head1 = head;
		node head2 = mid.next;
		
		mid.next = null;
		last.next = null;
		print(head1);
		print(head2);
		
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
