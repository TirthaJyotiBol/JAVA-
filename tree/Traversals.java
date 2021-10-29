package tree;
import java.util.Scanner;
public class Traversals 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the root value : ");
		node root = create();
		
		System.out.println("Pre Order : NLR -> ");
		preOrder(root);
		
		System.out.println("Post Order : LRN -> ");
		postOrder(root);
		
		System.out.println("Inorder : LNR -> ");
		inOrder(root);
	}
	
	
	// 1. Inorder Traveral : L.N.R
	 static void inOrder(node root) {
		 if(root == null) return;
		 inOrder(root.left);
		 System.out.println(root.data);
		 inOrder(root.right);
	 }
	 
	 // 2. Pre Order Traversal : N.L.R
	 static void  preOrder(node root) {
		 if(root == null) return;
		 System.out.println(root.data);
		 preOrder(root.left);
		 preOrder(root.right);
	 }
	 
	 // 3. Post Order Traversal  : L.R.N
	 static void postOrder(node root) {
		 if(root == null) return;
		 postOrder(root.left);
		 postOrder(root.right);
		 System.out.println(root.data);
	 }
	 
	 // create a tree
	static node create() {
	int data = scan.nextInt();
	node root = new node(data);
	if(data == -1) return null;
	// left data
	System.out.println("Enter the left data of : "+data);
	root.left = create();
	
	// right data
	System.out.println("Enter the right data of : "+data);
	root.right = create();
	
	return root;
 }
	
	
	static class node{
		node left;
		node right;
		int data;
		node(int data){
			this.data = data;
		}
	}
}

/*
 				 1
 			  /     \
 			 2       3
 			/ \     / \
 		   4   5   6   7 
 
 Enter the root value : 
1
Enter the left data of : 1
2
Enter the left data of : 2
4
Enter the left data of : 4
-1
Enter the right data of : 4
-1
Enter the right data of : 2
5
Enter the left data of : 5
-1
Enter the right data of : 5
-1
Enter the right data of : 1
3
Enter the left data of : 3
6
Enter the left data of : 6
-1
Enter the right data of : 6
-1
Enter the right data of : 3
7
Enter the left data of : 7
-1
Enter the right data of : 7
-1
Pre Order : NLR -> 
1 2 4 5 3 6 7

Post Order : LRN -> 
4 5 2 6 7 3 1

Inorder : LNR -> 
4 2 5 1 6 3 7
 
  */


