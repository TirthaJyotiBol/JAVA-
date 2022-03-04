package linkedList;
import java.util.LinkedList;
import java.util.Queue;

public class Flatten_ML_LL {

	public static void main(String[] args) {
		Node head = new Node(11);
		Node n1 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(42);
		Node n5 = new Node(62);
		Node n6 = new Node(7);
		Node n7 = new Node(8);
		Node n8 = new Node(92);
		
		n4.next = n5;
		n5.next = n6;
		n5.down = n7;
		n7.next = n8;
		head.next = n1;
		n1.next = n3;
		n1.down =  n4;
	
		
		Node h = flat(head);
		print(h);

	}
	
	static class Node{
		int data;
		Node next;
		Node down;
		Node(int data){
			this.data = data;
		}
	}
	
	static Node flat(Node head) {
		if(head == null) return null;
		
		Node dummy = new Node(0);
		Node temp = dummy;
		Node curr = head;
		Queue<Node> q = new LinkedList<>();
		while(curr!=null) 
		{
			
			if(curr.next == null) 
			{
				curr.next = q.poll();
			}
			
			if(curr.down!=null) {
				q.add(curr.down);
			}
			
		    temp.next = new Node(curr.data);
			temp = temp.next;
			curr = curr.next;
		}
		
		return dummy.next;
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
