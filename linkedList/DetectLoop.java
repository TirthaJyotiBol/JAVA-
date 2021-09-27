package linkedList;
import java.util.*;
public class DetectLoop {
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
		
		System.out.println(LoopDetecter(head));
	}
	
	
	static boolean LoopDetecter(node head) {
		boolean isFound = false;
		HashMap<node,Integer> map = new HashMap<>();
		node temp = head;
		while(temp!=null) {
			if(!map.containsKey(temp)){ 
		      map.put(temp,temp.data);
		      isFound = false;
			}else {
				isFound = true;
				break;
			}
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
