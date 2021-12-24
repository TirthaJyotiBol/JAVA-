package tree;
import tree.creation_tree.node;
public class Lowest_common_Ancestor {

	public static void main(String[] args) {
		node root = creation_tree.createTree();
		node ans = lca(root,2,5);
		System.out.println(ans.data);
	}
	
	static node lca(node root, int x, int y) {
		if(root == null) return null;
		
		if(root.data == x || root.data == y)  return root;		// if data is found then return that data
		
		node left = lca(root.left , x, y);
		node right = lca(root.right , x, y);
		
		if(left == null) return right;			// if left is null then element should be in right
		else if(right == null) return left;
		
		else return root;
	}
}
