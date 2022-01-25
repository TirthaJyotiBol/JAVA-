package gtree;
import gtree.Create.Node;
public class size {

	public static void main(String[] args) {
		Node root = gtree.Create.tree();
		System.out.println(sizes(root));
	}
	
	static int sizes(Node root) {
		int size = 0;
		
		for(Node child:root.childern) {
			int childSize = sizes(child);
			size = size + childSize;
		}
		size+=1;		// 1 for the root
		
		return size;
	}

}
