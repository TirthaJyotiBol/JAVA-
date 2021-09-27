package linkedList;
import java.util.HashMap;
public class DetectLoopOptimised {
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
		node temp = head;
		
		while(temp!=null) {
			if(temp.flag == false) {
			temp.flag  = true;
			isFound = false;
			}
			else {
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
		boolean flag = false;
		node(int data){
			this.data = data;
		}
	}
}
