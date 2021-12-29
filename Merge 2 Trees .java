/*
 
 ALGO ->
 1. Through Inorder Traversal convert  ( Tree1 into List1 )  and ( Tree2 into List2 )
 2. Merge the 2 sorted Lists ( List1 and List2 ) and store them in List3
 3. Convert the List3 into Binary Search tree using Binary search method
  
 */

package BST;
import java.util.*;
import BST.tree.Node;
public class Merge_2_trees {
	public static void main(String[] args) {
		Node root = null;
		root = tree.create(root, 100);
		root = tree.create(root, 50);
		root = tree.create(root, 300);
		root = tree.create(root, 20);
		root = tree.create(root, 70);
		
		Node root2 = null;
		root2 = tree.create(root2, 80);
		root2 = tree.create(root2, 40);
		root2 = tree.create(root2, 120);
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
// Using this we will get 2 sorted lists
		convertTTL(root,list);
		convertTTL(root2, list2);
		

// Merge the 2 sorted lists 
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		merge(list, list2 ,list3);


// convert the list into Binary Search Tree
		Node ans = convertLTT( list3 , 0 ,list3.size()-1);
		
		// Inorder Traversal to see answer
		inOrderTraversal(ans);
	}
	
	
	
	
	
// 	Inorder Traversal to convert Tree into a ArrayList
	static void convertTTL(Node root,ArrayList<Integer> list) {
		if(root == null) return;
		convertTTL(root.left, list);
		list.add(root.data);
		convertTTL(root.right, list);
	}
	
	
//  Merges the 2 sorted list and store them in another list
	static void merge(ArrayList<Integer>a, ArrayList<Integer>b , ArrayList<Integer>ans) {
		int i = 0;
		int j = 0;
		
		while(i<a.size() && j<b.size() ) {	
			
			if(a.get(i) <= b.get(j)) {
				ans.add(a.get(i));
				i++;
			}
			else {
				ans.add(b.get(j));
				j++;
			}
			
			if(i == a.size()) {
				while(j<b.size()) {
					ans.add(b.get(j));
					j++;
				}
			}
			
			if(j == b.size()) {
				while(i<a.size()) {
					ans.add(a.get(i));
					i++;
				}
			}
		}
		
	}
	
// Convert list into tree
	static Node convertLTT(ArrayList<Integer>list , int start, int end) {
		if(start > end) return null;
		
		int mid = (start + end)/2;

		Node root = new Node(list.get(mid));
		
		root.left = convertLTT(list, start, mid-1);
		root.right = convertLTT(list, mid+1, end);
		
		return root;
	}
	
// Inorder Traversal
	static void inOrderTraversal(Node root) {
		if(root == null) return;
		
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}

}
