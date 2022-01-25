package gtree;
import gtree.Create.Node;
public class maxElement {

	public static void main(String[] args) {
		Node root = gtree.Create.tree();
		System.out.println(max(root));
	}
	
	static int max(Node root) {
		int max = Integer.MIN_VALUE;
		for(Node x:root.childern) {
			int cm = max(x);
			max = Math.max(max, cm);
		}
		
		max = Math.max(root.data, max);
		return max;
	}

}
