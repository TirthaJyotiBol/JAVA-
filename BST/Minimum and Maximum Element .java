package BST;
import BST.tree.Node;
public class Min_and_Max_Element {
	public static void main(String[] args) {
		 Node root = null;
		 root = tree.create(null, 10);
		 root = tree.create(root, 1);
		 root = tree.create(root, 110);
		 root = tree.create(root, 170);
		 root = tree.create(root, 180);
		 root = tree.create(root, -10);
		 root = tree.create(root, -10);
		 root = tree.create(root, 210);
		 root = tree.create(root, 9);
		
		 int min = min(root);
		 int max = max(root);
		 
		 System.out.println("Minimum : " +min);
		 System.out.println("Maximum : " +max);

	}
	
//	 The leftmost element is the minimum	
	static int min(Node root) {
		if(root == null) return -1;
		int ans = root.data;
		
		while(root.left!=null) {
			ans = root.left.data;
			root = root.left;
		}
		return ans;
	}

//	 The rightmost element is the Maximum Element
	static int max(Node root) {
		if(root == null) return -1;
		int ans = root.data;
		
		while(root.right!=null) {
			ans = root.right.data;
			root = root.right;
		}
		return ans;
	}
	
	
}
