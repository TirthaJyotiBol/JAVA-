package linkedList;
public class DeleteCircularNode {
	public static void main(String[]args) {
		node n1 = new node(1);
		node n2 = new node(10);
		node n3 = new node(33);
		node n4 = new node(442);
		node n5 = new node(225);
		node n6 = new node(6);
		node n7 = new node(15);
		node head = n1;
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n1;
		
		print(head);
		delete(head,10);
		print(head);
	}
	
	static void delete(node head, int data) {
		node temp = head;
		boolean isFound = false;
		
		// boundary condiion -> if list is empty 
		if(head == null) {
			isFound = true;
			System.out.println("The list is empty");
		}
		node last = lastEle(head);
		while(temp!=last) {     // this is because it temp pointer should not overgo the infinite loop
			
			// first node
			if(temp.data == data) {
				isFound = true;
				 temp.data = temp.next.data;
				 temp.next = temp.next.next;
				 break;
			}
			// Anywhere else
			if(data == temp.next.data) {
				isFound = true;
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
		
		if(isFound == false) System.out.print("Data not in list , the original list is : ");
	}
	
	// gets the last node
	static node lastEle(node head) {
		node temp = head.next;
		while(temp.next!=head) {
			temp = temp.next;
			}
		return temp;
	}
	static class node{
		node next;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static void print(node head) {
		node temp = head.next;
		System.out.print(head.data+" ");
		while(temp!=head) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

}
