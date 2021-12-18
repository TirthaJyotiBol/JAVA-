package tree;
import tree.creation_tree.node;
public class LevelOrder_recursion {
	public static void main(String[] args) {
		node root = creation_tree.createTree();
		LevelOrder(root);
	}
	
  // Print Current Level of each Levels through traversal
	static void LevelOrder(node root) {
		int height = height(root);
		for(int level=1; level<=height; level++) {
			currLevel(root,level);
		}
	}
	
  // Current Level 
	static void currLevel(node root , int level) {
		if(root == null )return;
		if(level == 1) System.out.print(root.data+" ");
		
		currLevel(root.left,level-1);
		currLevel(root.right,level-1);
	}
	
	static int height(node root) {
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}

}
