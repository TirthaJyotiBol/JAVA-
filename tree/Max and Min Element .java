package tree;
import tree.creation_tree.node;

public class max_and_min_ELEMENT {
	public static void main(String[]args) {
		System.out.println("Enter the root value : ");
		node root = creation_tree.createTree();
		int max = max(root);
		System.out.println("Maximum Element : "+max);
		
		int min = min(root);
		System.out.println("Minimum Element : "+min);

	}
	
	// Max of root , left and right
	static int max(node root) {
		if(root == null) return Integer.MIN_VALUE;
		
		return Math.max(root.data, Math.max(max(root.left), max(root.right)));
	}
	
	// Min of root , left , right
	static int min(node root) {
		if(root == null) return Integer.MAX_VALUE;
		
		return Math.min(root.data, Math.min(min(root.left),min(root.right)));
	}
}
