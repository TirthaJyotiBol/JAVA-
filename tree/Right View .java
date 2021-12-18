package tree;
import tree.creation_tree.node;
import java.util.*;
public class Right_View {
	public static void main(String[] args) {
		node root = creation_tree.createTree();
		RightView(root);
	}
	
	static void RightView(node root) {
		ArrayList<node> list = new ArrayList<>();
		RightViewUtil(list,0,root);
		
		for(node l : list) {
			System.out.print(l.data+" ");
		}
	}
	
	static void RightViewUtil(ArrayList<node> list, int level, node root) {
		if(root == null) return;
		
		if(level==list.size()) list.add(root);
			
		
		RightViewUtil(list,level+1,root.right);  // Right
	    RightViewUtil(list,level+1,root.left);   // Left
	}

}
