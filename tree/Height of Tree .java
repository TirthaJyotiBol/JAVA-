package tree;
import java.util.*;
public class Height {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the node value : ");
		node root = create();
		int height = height(root);
		System.out.println("Height of the Binary Tree is : "+height);
	}
	
	static int height(node root) {
		if(root==null) return 0;
		
		return Math.max(height(root.left),height(root.right))+1;
	}
	
  
  // Creation of tree
	static class node{
		node left;
		node right;
		int data;
		node(int data){
			this.data = data;
		}
	}
	
	static node create() {
		int data = scan.nextInt();
		if(data == -1) return null;
		node root = new node(data);
		
		System.out.println("Enter the left of "+data);
		root.left = create();
		
		System.out.println("Enter the right of "+data);
		root.right = create();
		
		return root;
	}
}
