package linkedList;

public class Nth_node_from_END {
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
		
		print(n1);
		
		int ans = nthNode(n1,4);
		System.out.println(ans);
	}
	
    static int nthNode(Node head, int n)
    {
        if(head == null ) return -1;
    	int size = size(head);
    	
    	if(n > size) return -1;
    	Node temp = head;
    	int i = 0;
    	for(i=0;i<size-n;i++){
    	    temp = temp.next;
    	}
    	
    	return temp.data;
    }  
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

    
    static int size(Node head){
        Node curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
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
