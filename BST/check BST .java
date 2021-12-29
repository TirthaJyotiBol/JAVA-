/*

Divide the tree into 2 parts ->

  for left => "int.min to root"
  for right => " root to int.max"
  
*/


package BST;
import BST.tree.Node;
public class check_bst {

	public static void main(String[] args) {
		Node root = null;
		root = tree.create(root, 50);
		root = tree.create(root, 30);
		root = tree.create(root, 20);
		root = tree.create(root, 40);
		root = tree.create(root, 70);
		root = tree.create(root, 60);
		root = tree.create(root, 80);
		root = tree.create(root, 10);
		
		boolean ans = isBst(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
		
		System.out.println(ans);
	}
	
	static boolean isBst(Node root, int min, int max) {
		if(root == null) return true;
		
		if(root.data>=max || root.data<=min ) return false;       // If the limit exceeds
		
		return isBst(root.right, root.data , max )&& isBst(root.left , min , root.data) ;
		
	}

}
