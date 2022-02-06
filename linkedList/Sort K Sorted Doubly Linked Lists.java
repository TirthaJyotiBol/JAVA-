package linkedList;
import java.util.*;
public class Sort_K_Sorted_LinkedLists {

	public static void main(String[] args) {
		
		node head = new node(3);
		node p1 = new node(6);
		node p2 = new node(2);
		node p3 = new node(12);
		node p4 = new node(56);
		node p5 = new node(8);
		
		head.next = p1;
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		
		head.prev = null;
		p1.prev = head;
		p2.prev = p1;
		p3.prev = p2;
		p4.prev = p3;
		p5.prev = p4;
		
		
		node ans = sort(head,2);    // sort and print in forward direction
		print(ans);
		
		node tail = getTail(ans);	// print the sorted list in reverse direction
		printRev(tail);
		
		
	}
	static class node{
		int data;
		node prev;
		node next;
		node(int data){
			this.data = data;
		}
	}
	
	static node sort(node head,int k) {
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		if(head == null) return null;
		
		node trav = head;
		
		for(int i=0;i<=k || trav!=null;i++) {
			pq.add(trav.data);//
			trav = trav.next;
		}
		node dummy = new node(0);
		node temp = dummy;
		node previous = temp;
		while(trav!=null) {
			temp.next = new node(pq.peek());//
			temp = temp.next;
			temp.prev = previous;
			pq.poll();
			pq.add(trav.data);//
			trav = trav.next;
		}
		while(!pq.isEmpty()) {
			temp.next = new node(pq.peek());
			temp = temp.next;
			temp.prev = previous;
			previous = previous.next;
			pq.poll();
		}
		
		node ans = dummy.next;
		ans.prev = null;
		return ans;
	}
	
	
	
	static node getTail(node head) {
		node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		
		return curr;
	}
	
	static void print(node head) {
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	static void printRev(node tail) {
		node curr = tail;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.prev;
		}
	}

}
