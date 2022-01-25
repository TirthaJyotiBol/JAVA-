package gtree;
import java.util.*;

public class Lock_Unlock {

	public static void main(String[] args) {
	
		Node root = new Node(1);
		
		
		Node t1 = new Node(root);
		Node t2 = new Node(root);
		Node t3 = new Node(root);

		root.children.add(t1);
		root.children.add(t2);
		root.children.add(t3);
		
		boolean s = isLocked(t1);
		System.out.println(s);
		
		lock(t1);
		boolean s2 = isLocked(t1);
		System.out.println(s2);	
		
		unlock(t1);
		boolean s3 = isLocked(t1);
		System.out.println(s3);
		
	}


	// costruct a clas Node
	static class Node{
		int data;
		boolean isLock;
		boolean isLockable;
		Node parent;
		ArrayList<Node>children = new ArrayList<>();
		Node(){
			isLock = false;
			isLockable = true;
			parent = null;
		}
			
		Node(Node parent){
			this.parent = parent;
		}
	
		Node(int data){
			this.data = data;
		}
	}
	
	
	/*
	@SuppressWarnings("resource")
	Node construct(Node parent,int i) {
		Scanner scan = new Scanner(System.in);
		
		if(parent == null) {
			System.out.println("Enter the Root data");
		}
		else {
			System.out.println("Enter the child of "+parent.data);
		}
		
		int data = scan.nextInt();
		Node node = new Node(data);
		
		System.out.println("How many childrens does "+node.data+" have");
		int n = scan.nextInt();
		
		for(int j=0;i<n;i++) {
			Node child = construct(node,j);
			node.children.add(child);
		}
		
		return node;
	}
*/	
	
	
	static boolean isLocked(Node node) {
		return node.isLock;
	}
	
	static void lock(Node parent) {
		if(parent.isLockable == false) return ;
		
		// check if any of the anscestor is locked
		Node temp = parent;
		boolean is_anscester_locked = false;
		while(temp!=null) {
			if(temp.isLock == true) {
				is_anscester_locked = true;
				break;
			}
			temp = temp.parent;
		}
		
		// if anscestor is locked then we cannot lock 
		if(is_anscester_locked == true) {
			return ;
		}
		
		// if we found that it can be locked then lock this and update all the anscestors to non lockable
		else {
			parent.isLock = true;
			temp = parent;
			temp.isLock = true;
			
			while(temp!=null) {
				temp.isLockable = false;
				temp = temp.parent;
			}
		}	
		
	}
	
	// unlock and update all the ancestors as lockable
	
	static void unlock(Node parent) {
		if(parent.isLock == false) return;
		parent.isLock = false;
		Node temp = parent;
		while(temp.parent!=null) {
			temp.isLockable = true;
			temp = temp.parent;
		}
	}
	
}

