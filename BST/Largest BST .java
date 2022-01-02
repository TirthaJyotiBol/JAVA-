package BST;
import BST.tree.Node;
public class Largest_BST {
	public static void main(String[] args) {
		Node root = null;
		root = tree.create(root, 50);
		root = tree.create(root, 30);
		root = tree.create(root, 20);
		root = tree.create(root, 40);
		root = tree.create(root, 70);
		root = tree.create(root, 60);
		root = tree.create(root, 80);
		root = tree.create(root, 10);
		
		int ans = largest(root);
		System.out.println(ans);

	}
	
  
  
  
	static int largest(Node root) {
		return helper(root).size;
	}
	
  
  
	static class NodeValue{
		int minNode;
		int maxNode;
		int size;
		NodeValue(int minNode,int maxNode,int size){
			this.minNode = minNode;
			this.maxNode = maxNode;
			this.size = size;
		}
	}
	
	static NodeValue helper(Node root) {
	
	// An empty tree is always a binary search tree of size 0
		if(root == null) return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
		
	// POST order traversal
	    NodeValue left = helper(root.left);
	    NodeValue right = helper(root.right);
	   
	// if the tree is a BST
	  if(left.maxNode < root.data && root.data<right.minNode ) {
		  return new NodeValue(Math.max(left.maxNode, root.data), Math.min(root.data, right.minNode), (left.size+right.size+1) );
	  }
	  
	  else {
		  return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE, (left.size+right.size) );
	  }
	    
	    
	}

}
