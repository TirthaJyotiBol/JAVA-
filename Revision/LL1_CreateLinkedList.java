package Revision;
import java.util.*;
public class LL1_CreateLinkedList {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number of Nodes : ");
		int n = scan.nextInt();
		node head = create(n);
		print(head);

	}

	public static class node{
		int data;
		node next;
		node(int data){
			this.data = data;
		}
	}
	
	public static node create(int n) {
		System.out.println("Enter the Head Element :");
		int headData = scan.nextInt();
		node head = new node(headData);
		int i = 1;
		node curr = head;
		System.out.println("Enter the elements");
		while(i<n) {
			i++;
			int element = scan.nextInt();
			curr.next = new node(element);
			curr = curr.next;
		}
		
		curr.next = null;
		return head;
	}
	
	public static void print(node head) {
		node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}




