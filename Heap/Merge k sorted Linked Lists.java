package Heap;
import java.util.*;
public class Sort_k_sorted_LinkedLists {

	public static void main(String[] args) {
		node h1 = new node(1);
		node h2 = new node(2);
		node h3 = new node(3);
		
		h1.next = h2;
		h2.next = h3;
		
		node i1 = new node(4);
		node i2 = new node(5);
		i1.next = i2;
		
		node j1 = new node(5);
		node j2 = new node(6);
		j1.next = j2;
		
		node k1 = new node(7);
		node k2 = new node(8);
		k1.next = k2;
		
		ArrayList<node> list= new ArrayList<>();
		list.add(h1);
		list.add(i1);
		list.add(j1);
		list.add(k1);
		
		node head = merge(list);
		print(head);
	}
	
	static class node{
		int data;
		node next;
		node(int data){
			this.data = data;
		}
	}
	
	static class Triplet implements Comparable<Triplet>{
		node nod;
		int data;
		int arr_pos;
		Triplet(node nod,int data,int arr_pos){
			this.nod = nod;
			this.data = data;
			this.arr_pos = arr_pos;
		}
		@Override
		public int compareTo(Triplet o) {
			if(data<=o.data) return -1;
			return 1;
		}
		
	}
	
	static node merge(ArrayList<node>list) {

		PriorityQueue<Triplet> pq = new PriorityQueue<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)!=null) {
			pq.add(new Triplet(list.get(i),list.get(i).data,i));
			}
		}
		node ansHead = new node(0);
		node temp = ansHead;
	
		while(!pq.isEmpty()) {
			Triplet curr = pq.peek();
			node curr_node = curr.nod;
			int data = curr_node.data;
			int arr_pos = curr.arr_pos;
			
			node x = new node(data);
			temp.next = x;
			temp = x;
			pq.poll();
			
			if(curr_node.next!=null) {
				pq.add(new Triplet(curr_node.next,curr_node.next.data,arr_pos));
			}
			
		}
		return ansHead.next;
	}
	
	
	
	static void print(node head) {
		node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

}
