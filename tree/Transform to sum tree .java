
/* root value = (sum of subtree) */

package tree;
import tree.creation_tree.node;

public class TreeSum {
	public static void main(String[]args) {
		node root = creation_tree.createTree();
		treeSum(root);
		inorder(root);
	}
	
	static int treeSum(node root) {
		if(root == null) return 0;
		int roots = root.data;
		root.data = treeSum(root.left) + treeSum(root.right);
		
		return root.data + roots;
	}
	
	// Traverse
	static void inorder(node root) {
		if(root == null) return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
}
