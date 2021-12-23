package tree;
import java.util.*;
import tree.creation_tree.node;
public class BoundaryTraversal {
	public static void main(String[] args) {
		node root = creation_tree.createTree();
		traversal_boundary(root);
	}
	
	static void traversal_boundary(node root) {

		ArrayList<Integer>ans = new ArrayList<>();
		if(root == null) return;
		ans.add(root.data);
		
		LeftBoundary(root,ans);     // Left Boundary
		BottomBoundary(root,ans);	// Bottom Boundary
		RightBoundary(root,ans);	// Right Boundary
		
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" " );
		}
	}
	
	// Method to check if the node is leaf
	static boolean isLeaf(node root) {
		
		if(root.left==null && root.right ==null) return true;
		return false;
	}
	
	// Method to get the Left Boundary
	static void LeftBoundary(node root, ArrayList<Integer> list) {
		node curr = root.left;
		
		while(curr!=null) {
			if(isLeaf(curr) == false) list.add(curr.data);
			
			if(curr.left!=null) curr = curr.left;
			else {
				curr = curr.right;
			}
		}
	}
	
	// Right Boundary
	static void RightBoundary(node root, ArrayList<Integer> list) {
		node curr = root.right;
		
		ArrayList<Integer> temp = new ArrayList<>();
		while(curr!=null) {
			if(isLeaf(curr) == false) temp.add(curr.data);
			
			if(curr.right!=null) curr = curr.right;
			else curr = curr.left;
		}
		// since we need the right boundary from bottom to top thus we reverse the list
		for(int i = temp.size()-1;i>=0;i--) {
			list.add(temp.get(i));
		}
	}
	
	// Bottom Boundary
	static void BottomBoundary(node root,ArrayList<Integer>list) {
		if(isLeaf(root)) {
			list.add(root.data);
			return;
		}
		if(root.left!=null)  BottomBoundary(root.left , list);
		if(root.right!=null) BottomBoundary(root.right, list);
	}

}
