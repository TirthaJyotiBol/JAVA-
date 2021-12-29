package BST;
import BST.tree.Node;
public class Count_nodes_in_a_given_range {

	public static void main(String[] args) {
		Node root = null;
		root = tree.create(root, 3);
		root = tree.create(root, 4);
		root = tree.create(root, 5);
		root = tree.create(root, 6);
		root = tree.create(root, 7);

		int low = 2;
		int high = 8;
		int ans = count(root,low,high);
		
		System.out.println(ans);

	}
	
	static int count = 0;
	
	 static int count(Node root, int low, int high) {
		inorder(root,low,high);
		
		return count;
	}
	
	 static void inorder(Node root, int low, int high) {
		if(root == null) return;
		
		inorder(root.left,low,high);
		if(root.data>=low && root.data<=high) {
			count++;
		}
		inorder(root.right,low,high);
	}

}
