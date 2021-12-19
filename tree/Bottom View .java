package tree;
import tree.creation_tree.node;
import java.util.*;
public class Bottom_view {
	public static void main(String[]args) {
		System.out.println("Enter the root value : ");
		node root = creation_tree.createTree();
		bottomView(root);
	}

	static void bottomView(node root) {
		HashMap<Integer,node> map = new HashMap<>();
		bottomView(root, 0, map);
		
		for(Map.Entry<Integer, node> m: map.entrySet()) {
			System.out.print(m.getValue().data+" ");
		}
		
	}
	
	static void bottomView(node root,int level, HashMap<Integer,node> map) {
		if(root == null) return;
		
		map.put(level,root);   				// Since we need the bottom thus update the current status
		bottomView(root.left,level-1,map);
		bottomView(root.right,level+1,map);
	}
}
