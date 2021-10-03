package linkedList;
public class Intersection_1 {
	public static void main(String[]args) {
		node n1 = new node(0);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(10);
		
		node m1 = new node(1);
		node m2 = new node(2);
		node m3 = new node(3);
		node m4 = new node(10);
		
		// 1st list
		node head1 = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		//2nd list
		node head2 = m1;
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
		m4.next = null;
		
		System.out.print("List 1 : "); print(head1);
		System.out.print("List 2 : "); print(head2);
		
		System.out.print("Intersection : ");
		intersection(head1,head2);
	}
	
	static void intersection(node head1, node head2) {
		node i = head1;
		node j = head2;
		
		// Base case
		if(i==null || j==null) {
			System.out.println("No such intersection ");
		}
		
		while(i!=null || j!=null) {
			//As soon pointer reaches its end we stop 
			if(i==null || j==null) {
				break;
			}
			
			if(i.data < j.data) {
				i = i.next;
				if(i == null)  break;	
			}
			
			if(j.data < i.data) {
				j = j.next;
				if(j == null) break;
			}
			
			// When data is found we print the data
			if(i.data == j.data) {
				System.out.print(i.data+" ");
			}
			i = i.next;
			j = j.next;
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
