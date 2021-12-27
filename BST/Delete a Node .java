package BST;
import BST.tree.Node;
public class Delete_node {
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
		
		inorder(root);
		System.out.println();
		deletion(root,30);
		deletion(root,80);
		inorder(root);
		
	}
	
	static Node deletion(Node root, int key) {
		if(root == null) return root;
		
		if(key > root.data) {
			root.right = deletion(root.right,key);
		}
		else if(key < root.data) {
			root.left = deletion(root.left,key);
		}
		
		// Only 1 child
	else {
		
		// If both of the childern are null i.e. Leaf
		if(root.left == null && root.right == null)
				return null;
		// If either of then children is null
		if(root.left == null)
				return root.right;
		if(root.right == null)
				return root.left;
		
		// If having 2 children then take the minimum from the right and replace it with that element
		if(root.left != null && root.right != null) {
		root.data = min(root.right);
		root.right = deletion(root.right,root.data);
		}
		
	}
		
		return root;
	}
	
	// Code to find the minimum element
	static int min(Node root) {
		
		int min = root.data;
		while(root.left!=null) {
			min = root.left.data;
			root = root.left;
		}
		
		return min;
	}
	
	static void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
}
