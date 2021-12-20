/*
 A tree is balanced if the difference between left and right is less than 2
 */

package tree;
import tree.creation_tree.node;
public class CheckBalance {
	public static void main(String[]args) {
		node root = creation_tree.createTree();
		boolean ans = isBalanced(root);
		System.out.println(ans);
	}
	
	static boolean isBalanced(node root) {
		if(root == null) return true;
		int left_height = height(root.left);
		int right_height = height(root.right);
		
		return Math.abs(right_height-left_height)<=1 && isBalanced(root.left) && isBalanced(root.right) ;
	}
	
	static int height(node root) {
		if(root == null) return 0;
		
		return Math.max(height(root.left), height(root.right))+1;
	}
	
}
