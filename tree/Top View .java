package tree;
import tree.creation_tree.node;
import java.util.*;
public class Top_View {
	public static void main(String[] args) {
		System.out.println("Enter the root value ");
		node root = creation_tree.createTree();
		print(root);
	}
	
	static void print(node root) {
		HashMap<Integer , node> map = new HashMap<>();
		topView(root,map,0);
		for(Map.Entry<Integer,node> m : map.entrySet()) {
			System.out.print(m.getValue().data+" ");
		}
	}
	
	static void topView(node root,HashMap<Integer,node> map,int level) {
		if(root == null) return;
		
		map.putIfAbsent(level, root);
		
		topView(root.left,map,level-1);
		topView(root.right,map,level+1);
	}
}
