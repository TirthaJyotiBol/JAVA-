package BST;
import BST.tree.Node;
public class Searching {
	public static void main(String[] args) {
		
		Node root = null;
		root = tree.create(root, 10);
		root = tree.create(root, 53);
		root = tree.create(root, 52);
		root = tree.create(root, 35);
		root = tree.create(root, 45);
		root = tree.create(root, 55);
		root = tree.create(root, 95);
		
		Node ans = search(root,45);

		if(ans == null) System.out.println("Not Found");
		else {
			System.out.println(ans.data +" "+ans);
		}
	}
	
	static Node search(Node root , int element) {
		if(root == null || root.data == element) {
			return root;
		}
		
		if(element >= root.data) {
			return search(root.right , element);
		}
		else {
			return search(root.left,element);
		}
	}
	

}
