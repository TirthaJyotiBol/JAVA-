package Revision;


public class LL7_removeDuplicates {

	public static void main(String[] args) {

		node head = new node(1);
		node n1 = new node(2);
		node n2 = new node(3);
		node n3 = new node(4);
		node n4 = new node(4);
		node n5 = new node(4);
		node n6 = new node(4);
		node n7 = new node(4);
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = null;
		
		print(head);
		remove(head);
		print(head);
		

	}
	
	static void print(node head) {
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static void remove(node head) {
		node curr = head;
		
		while(curr!=null) {
			node temp = curr;
			while(temp!=null && temp.data==curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
		
	}

}
