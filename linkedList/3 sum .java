/*
 Q. Find if there exists 3 elements in the linked list whose sum equals to the given data
 
 Algorithm :
   1.  Put all the elements of the list into an Map
   2.  Take 2 pointers ptr1 and ptr2 and find its sum
   3.  Check the Map if there exists a element equal to [Data - Sum]  and also check if the
       value [Data - Sum]  not equals to the 2 pointers  
          { if this condition is not satisfies then we will get output of 2 sum ; we need to find a value 
            rather than the 2 pointers }
   4. The above will give us output for all the 3 cases of (ptr1, ptr2 and x) but we need no repetations 
      thus we divide count by 3
  */

package linked_list;
import java.util.*;
public class Three_sum {
	public static void main(String[]args) {
		node n1 = new node(1);
		node n2 = new node(2);
		node n3 = new node(3);
		node n4 = new node(4);
		node n5 = new node(5);
		node n6 = new node(6);
		node n7 = new node(7);
		node n8 = new node(8);
		node n9 = new node(9);
		node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next =n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = null;
		
		n9.prev = n8;
		n8.prev = n7;
		n7.prev = n6;
		n6.prev = n5;
		n5.prev = n4;
		n4.prev = n3;
		n3.prev = n2;
		n2.prev = head;
		head.prev = null;
		three(head,10);
	}
	
	static void three(node head,int data) {
		HashMap<Integer,node> map = new HashMap<>();
		node ptr = head;
		int count = 0;
		// put all the elements in the map 
		while(ptr!=null) {
			map.put(ptr.data,ptr);
			ptr = ptr.next;
		}		
		for(node i = head; i!=null ;i=i.next) {
			for(node j = i.next ;j!=null ;j=j.next) {
				int sum = i.data + j.data;
				if(map.containsKey(data - sum) && map.get(data - sum)!=i && map.get(data-sum)!=j) {
					count++;
				}
			}
		}
		System.out.println(count/3);
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
