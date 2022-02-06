package linkedList;

public class Sort_012 {

	public static void main(String[] args) {
		Node n1 = new Node(2);
		Node n2 = new Node(0);
		Node n3 = new Node(2);
		Node n4 = new Node(0);
		Node n5 = new Node(1);
		Node n6 = new Node(0);
		Node n7 = new Node(0);
		Node n8 = new Node(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		
		print(n1);
		Node n = sort(n1);
		print(n);
		
	}
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
    static Node sort(Node head)
    {
        if(head == null) return null;
        Node head2 = head;
        int z_count = count(head2,0);
        int o_count = count(head2,1);
        int t_count = count(head2,2);
        
        Node dummy = new Node(0);
        Node temp = dummy;
        
        while(z_count > 0){
           temp.next = new Node(0);
           temp = temp.next;
           z_count--;
        }
        
        while(o_count > 0){
            temp.next = new Node(1);
            temp = temp.next;
            o_count--;
        }
        
        while(t_count > 0){
            temp.next = new Node(2);
            temp = temp.next;
            t_count--;
        }
        
        return dummy.next;
    }
    
    static int count(Node head,int i){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            if(temp.data == i){
                count++;
            }
            temp = temp.next;
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
