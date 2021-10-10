/*
 Q. Find if a there exists a sum of the pair [ Same as Array ] 
      1. Take 2 pointers head and tail
      2. Sum = head.data + tail.data
      3. if sum > data    =>  tail = tail.prev
         if sum <= data   => head = head.next     ->   greater than equal to avoid infinite loop 
         if sum == data then return data
  */


package linkedList;
public class Find_sum_pair {
	public static void main(String[]args)
	{
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next =null;
		n5.prev = n4;
		n4.prev = n3;
		n3.prev = n2;
		n2.prev = head;
		head.prev = null;

		findPair(head,8);
		
	}
	static void findPair(node head, int data) {
		boolean isThere = false;
		node temp = head;
		node Head = head;
		node tail = tail(temp);
		
	    while(tail!=Head)
	    {
	    	int sum = Head.data + tail.data;
	    	if(sum == data) {
	    		System.out.println(Head.data +" "+ tail.data);
	    	}
	    	if(sum>data) {
	    		tail = tail.prev;
	    	}
	    	if(sum<=data) {
	    		Head = Head.next;
	    		isThere = true;
	    	}
	    }	
	    if(isThere == false){
	         System.out.println("Not Found");	
	    }
	}
	static node tail(node head) {
		node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}return temp;
	}
	
	static class node{
		int data;
		node prev,next;
		  node(int data){
			this.data = data;
		}
	}
	static void print(node head) {
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}System.out.println();
	}
}
