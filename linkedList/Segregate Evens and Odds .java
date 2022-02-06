package linkedList;
public class Segregate_EvenOdds {

	public static void main(String[] args) {
		Node n1 = new Node(21);
		Node n2 = new Node(10);
		Node n3 = new Node(42);
		Node n4 = new Node(9);
		Node n5 = new Node(7);
		Node n6 = new Node(04);
		Node n7 = new Node(899);
		Node n8 = new Node(110);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		Node h = divide(n1);
		print(h);
	}
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	static Node divide(Node head){
        if(head==null) return null;
        
        Node dummy = new Node(0);
        Node temp = dummy;
        Node curr = head;
        
        // Get the Evens from the List
        while(curr!=null){
            if(curr.data % 2 == 0){
                temp.next = new Node(curr.data);
                temp = temp.next;
            }
            curr = curr.next;
        }
        
        curr = head;  // reset the current node to head
        // Get the Odds from the List
        while(curr!=null){
            if(curr.data % 2 != 0){
                temp.next = new Node(curr.data);
                temp = temp.next;
            }
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
