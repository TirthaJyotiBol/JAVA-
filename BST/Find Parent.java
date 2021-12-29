package BST;
import BST.tree.Node;
public class Find_parent {
	public static void main(String[]args) {
		Node root = null;
		root = tree.create(root, 2);
		root = tree.create(root, 12);
		root = tree.create(root, 4);
		root = tree.create(root, 8);
		root = tree.create(root, 3);
		root = tree.create(root, 7);
		root = tree.create(root, 9);
		
		Node ans = findParent(root , 7);
		
		if(ans != null) {
			System.out.println(ans.data);
		}else {
			System.out.println("Parent not found");
		}
		
		
	}
	
	static Node findParent(Node root, int value) {
		if(root == null) return null;
		
		Node parent = null;
		
		while(root!=null) {
			if(value > root.data) {
				parent = root;
				root = root.right;
			}
			else if(value < root.data) {
				parent = root;
				root = root.left;
			}
			else { // if the data is found
				break;
			}
		}
		
		
		if(root == null) return null;
		return parent;
	}
	
}
