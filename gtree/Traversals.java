package gtree;
import gtree.Create.Node;
public class Traversals {

	public static void main(String[] args) {

		Node root = gtree.Create.tree();
		traversal(root);
	}
	
	static void traversal(Node root) {
		System.out.println("Pre "+root.data);
		
		for(Node x:root.childern) {
			traversal(x);
		}
		
		System.out.println("Post "+root.data);
		
	}

}
