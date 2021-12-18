package tree;
import java.util.*;
import tree.creation_tree.node;;
public class Left_View {
	public static void main(String[] args) {
		node root = creation_tree.createTree();
		leftView(root);
	}
	
	static void leftView(node root) {
		ArrayList<node> list= new ArrayList<>();
		leftView(root,0,list);
		
		for(node l:list) {
			System.out.print(l.data+" ");
		}
	}
	
	static void leftView(node root, int level, ArrayList<node> list) {
		if(root == null) return;
		if(level == list.size()) list.add(root);
		
		leftView(root.left,level+1,list);    // Left
		leftView(root.right,level+1,list);   // Right
	}

}
