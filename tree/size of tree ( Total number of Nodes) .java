/*
 Its nothing but the Number of Nodes in the tree 
 
 		( size of left subTree + size of right subTree ) + 1
 
 */

package tree;
import java.util.*;
import tree.creation_tree.node;

public class Size {
Scanner scan = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the root value : ");
		node root = creation_tree.createTree();  
		
		int size = size(root);
		System.out.println("Size : "+size);
		
}
	static int size(node root) {
		if(root == null) return 0;
		
		return size(root.left)+size(root.right)+1;
	}
}
