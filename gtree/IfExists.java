package gtree;
import gtree.Create.Node;

public class IfExists {

	public static void main(String[] args) {
		Node tree = gtree.Create.tree();
		System.out.println(ifExists(tree,120));
	}
	
	static boolean ifExists(Node root,int ele) {
		if(root.data == ele) return true;
		
		for(Node child:root.childern) {
			boolean findChild = ifExists(child,ele);
			if(findChild) {
				return true;
			}
		}
		
		return false;
	}

}
