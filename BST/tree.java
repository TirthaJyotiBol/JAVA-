package BST;
import java.util.*;
public class tree {
	public static void main(String[] args) {

		Node root = null;
		root = create(root,8);
		root = create(root,7);
		root = create(root,6);
		root = create(root,4);
		root = create(root,-10);
		inorder(root);
		
	}
	
	static class Node{
		Node left;
		Node right;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	
	static Node create(Node root , int value) {
		if(root == null) {
			Node cur = new Node(value);
			return cur;
		}
		
		if(value<root.data) {
			root.left = create(root.left,value);
		}
		else {
			root.right = create(root.right,value);
		}

		return root;
	}
	
// Traversal
	static void inorder(Node root) {
		if(root == null) return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

}
