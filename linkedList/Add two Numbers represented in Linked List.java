package linkedList;

public class Add_2_Numbers {

	public static void main(String[] args) {

		node l1 = new node(2);
		node n1 = new node(4);
		node n3 = new node(3);
		
		node l2 = new node(5);
		node m1 = new node(6);
		node m2 = new node(7);
		node m4 = new node(9);
		
		// links
		l1.next = n1;
		n1.next = n3;
		
		l2.next = m1;
		m1.next = m2;
		m2.next = m4;
		
		node ans = add(l1,l2);
		
		print(l1);
		print(l2);
		print(ans);
		
	}
	
	
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static node add(node l1,node l2) {

		node dummy = new node(0);
		node temp = dummy;
		
		int carry = 0;
		while(l1!=null || l2!=null || carry==1) {
			int sum = 0;
			
			if(l1!=null) {
				sum =  sum + l1.data;
				l1 = l1.next;
			}
			
			if(l2!=null) {
				sum = sum + l2.data;
				l2 = l2.next;
			}
			
			sum = sum + carry;
			
			int remainder = sum % 10;
			int quotient = sum / 10;
			carry = quotient;
			node newNode = new node(remainder);
			temp.next = newNode;
			temp = temp.next;
			
		}
		
		return dummy.next;
		
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
