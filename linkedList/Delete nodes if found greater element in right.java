/*
 Given a Linked List : Remove the elements if there exists element greater than the current in the right
 */

package linkedList;
public class DelNodes_if_greaterValue_in_Right {

	public static void main(String[] args) {
		
		Node n1 = new Node(12);
		Node n2 = new Node(15);
		Node n3 = new Node(10);
		Node n4 = new Node(11);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(2);
		Node n8 = new Node(3);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		print(n1);
		
		Node ans = compute(n1);
		print(ans);
	}
	
	 static Node compute(Node head)
	   {
	       Node maxnode = head;
	       Node temp = head;
	       while(temp!=null) {
	           if(temp.data>maxnode.data) {
	               maxnode=temp;
	           }
	           temp=temp.next;
	       }
	       
	       // perform for first element and recursively call this for the remainings
	       if(maxnode.next!=null)
	           maxnode.next=compute(maxnode.next);
	           
	       return maxnode;
	   }
	
    
    
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
    static void print(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
    }
	
}
