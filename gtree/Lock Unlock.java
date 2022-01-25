package gtree;
import java.util.*;
public class Lock_Unlock {

	public static void main(String[] args) {

	}
	
	class Node{
		int data;
		boolean isLock;
		boolean isLockable;
		Node parent;
		ArrayList<Node>arr;
		Node(){
			isLock = false;
			isLockable = false;
			arr = new ArrayList<>();
		}
		
		Node(Node parent){
			this.parent = parent;
		}
	}
	
	boolean isLocked(Node node) {
		return node.isLock;
	}
	
	boolean lock(Node parent) {
		if(parent.isLockable == false) return false;
		
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
			return false;
		}
		
		// if we found that it can be locked then lock this and update all the anscestors to non lockable
		if(is_anscester_locked==false) {
			temp = parent;
			temp.isLock = true;
			while(temp!=null) {
				temp.isLockable = false;
				temp = temp.parent;
			}
		}	
		return true;
	}
	
	// unlock and update all the ancestors as lockable
	
	boolean unlock(Node parent) {
		if(parent.isLock == false) return false;
		parent.isLock = false;
		Node temp = parent;
		while(temp.parent!=null) {
			temp.isLockable = true;
			temp = temp.parent;
		}
		return true;
	}
}



















// package gtree;
// import java.util.*;

// public class Lock_Unlock {

// 	public static void main(String[] args) {
	
// 		Node root = new Node(1);
		
// //		Node t1 = new Node(root);
// //		Node t2 = new Node(root);
// //		Node t3 = new Node(root);
// //		
// //		root.children.add(t1);
// //		root.children.add(t2);
// //		root.children.add(t3);
// //		
// //		Node t5 = new Node(root.children.get(0));
// ////		root.children.get(0).children.add(t5);
// //		
// //		Node t4 = new Node(root.children.get(1));
// ////		root.children.get(1).children.add(t4);
// //		
// //		boolean isT4Locked = isLocked(t4);
// //		System.out.println(isT4Locked);
// //		
// //		lock(t4);
// //		 isT4Locked = isLocked(t4);
// //		System.out.println(isT4Locked);
		
		
// 		Node t1 = new Node(25);
// 		Node t2 = new Node(30);
// 		Node t3 = new Node(45);
// 		Node t4 = new Node(100);
// 		Node t5 = new Node(200);
// 		Node t6 = new Node(300);
// 		Node t7 = new Node(400);
		
// 		root.children.add(t1);
// 		root.children.add(t2);
// 		root.children.add(t3);
		
		
// 		root.children.get(0).children.add(t4);
// 		root.children.get(1).children.add(t5);
// 		root.children.get(2).children.add(t6);
// 		root.children.get(3).children.add(t7);
		
		
// 	}


// 	// costruct a clas Node
// 	static class Node{
// 		int data;
// 		boolean isLock;
// 		boolean isLockable;
// 		Node parent;
// 		ArrayList<Node>children;
// 		Node(){
// 			isLock = false;
// 			isLockable = true;
// 			parent = null;
// 			children = new ArrayList<>();
// 		}
		
// //		Node(int data,Node parent){
// //			this.data = data;
// //			this.parent = parent;
// //		}
// //		
// 		Node(Node parent){
// 			this.parent = parent;
// 		}
// //		
// 		Node(int data){
// 			this.data = data;
// 		}
// 	}
	
	
// 	/*
// 	@SuppressWarnings("resource")
// 	Node construct(Node parent,int i) {
// 		Scanner scan = new Scanner(System.in);
		
// 		if(parent == null) {
// 			System.out.println("Enter the Root data");
// 		}
// 		else {
// 			System.out.println("Enter the child of "+parent.data);
// 		}
		
// 		int data = scan.nextInt();
// 		Node node = new Node(data);
		
// 		System.out.println("How many childrens does "+node.data+" have");
// 		int n = scan.nextInt();
		
// 		for(int j=0;i<n;i++) {
// 			Node child = construct(node,j);
// 			node.children.add(child);
// 		}
		
// 		return node;
// 	}
// */	
	
	
// 	static boolean isLocked(Node node) {
// 		return node.isLock;
// 	}
	
// 	static void lock(Node parent) {
// 		if(parent.isLockable == false) return ;
		
// 		// check if any of the anscestor is locked
// 		Node temp = parent;
// 		boolean is_anscester_locked = false;
// 		while(temp!=null) {
// 			if(temp.isLock == true) {
// 				is_anscester_locked = true;
// 				break;
// 			}
// 			temp = temp.parent;
// 		}
		
// 		// if anscestor is locked then we cannot lock 
// 		if(is_anscester_locked == true) {
// 			return ;
// 		}
		
// 		// if we found that it can be locked then lock this and update all the anscestors to non lockable
// 		else {
// 			parent.isLock = true;
// 			temp = parent;
			
// 			while(temp!=null) {
// 				temp.isLockable = false;
// 				temp = temp.parent;
// 			}
// 		}	
		
// 	}
	
// 	// unlock and update all the ancestors as lockable
	
// 	static void unlock(Node parent) {
// 		if(parent.isLock == false) return;
// 		parent.isLock = false;
// 		Node temp = parent;
// 		while(temp.parent!=null) {
// 			temp.isLockable = true;
// 			temp = temp.parent;
// 		}
// 	}
	
// }


