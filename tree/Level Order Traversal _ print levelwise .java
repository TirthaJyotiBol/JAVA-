/*
 Print Level Wise
 
 Whenever Found any null print a new Line 
 Add a null after each 
 */

package tree;
import java.util.*;
import tree.creation_tree.node;
public class LevelOrder_differentLines {
	public static void main(String[] args) {
		node root = creation_tree.createTree();
		LevelOrder(root);
	}
	
	static void LevelOrder(node root) {
		if(root == null) return;
		Queue<node>q = new LinkedList<>();
		q.add(root);
		q.add(null);  // Extra Code
		
		while(!q.isEmpty()) {
			node curr = q.poll();
			
// Extra Code
			if(curr == null) {
				if(q.isEmpty()) return;
				System.out.println();
				q.add(null);
				continue;	
			}
// Upto Here 
			System.out.print(curr.data+" ");
			if(curr.left!=null) {
				q.add(curr.left);
			}
			
			if(curr.right!=null) {
				q.add(curr.right);
			}
		}
	}

}
