package tree;
import tree.creation_tree.node;
import java.util.*;
public class LevelOrder_queue_linear {
	public static void main(String[]args) {
		node root = creation_tree.createTree();
		LevelOrder(root);
	}
	
	static Queue<node> q =new LinkedList<>();		// Queue contains node value
	static void LevelOrder(node root) {
		if(root == null) return;
		q.add(root);
		
		while(!q.isEmpty()) {
			node curr = q.poll();
			System.out.print(curr.data+" ");
			
			if(curr.left!=null)
				 q.add(curr.left);
			
			if(curr.right!=null)
				q.add(curr.right);
		}
	}
	
}
