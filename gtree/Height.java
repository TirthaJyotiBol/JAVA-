package gtree;
import gtree.Create.Node;
public class Height {

	public static void main(String[] args) {
		Node root = gtree.Create.tree();
		System.out.println(height(root));
	}
	
	static int height(Node n) {
		int h = -1;
		
		for(Node x:n.childern) {
			int childHeight = height(x);
			h = Math.max(childHeight, h);
		}
		h = h+1;
		
		return h;
	}

}
