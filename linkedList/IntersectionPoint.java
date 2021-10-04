package linkedList;
import java.util.HashMap;
public class IntersectionPoint {
	public static void main(String[]args) {
		// Node 1
		node n1 = new node(13);
		node n2 = new node(14);
		node n3 = new node(5);
		node n4 = new node(6);

		// Node 2
		node n7 = new node(1);
		node n8 = new node(2);
		node n9 = new node(3);
		node n10 = new node(4);


		node head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		
		node head2 = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n1;
		
		print(head);
		print(head2);

		IntersectPoint(head, head2);
	}
	
	static void IntersectPoint(node head1, node head2) {
		HashMap<node , Integer> map = new HashMap<>();
		boolean isFound = false;
		node temp1 = head1;
		node temp2 = head2;
		// put first list into the map
		while(temp1!=null) {
			map.put(temp1,temp1.data);
			temp1 = temp1.next;
		}
		
		while(temp2!=null) {
			if(map.containsKey(temp2)) {
				isFound = true;
				System.out.println("Intersection point found at "+ temp2.data);
				break;
			}
			temp2 = temp2.next;
		}
		
		if(isFound == false) {
			System.out.println("Not found any intersection point ");
		}
	}
	
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static void print(node h) {
		node temp = h;
	    while(temp!=null) {
	    	System.out.print(temp.data+" ");
	    	temp = temp.next;
	    }
	    System.out.println();
	}
}
