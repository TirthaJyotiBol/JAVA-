/*
1. use inorder traversal
2. Move to the leftmost part
3. Put that as head
4. Put it as prev
5. Get the right , use root.left as prev

(Anuj / GFG course Tarun)

 */

package BST;
import BST.tree.Node;
public class Flatten {

	public static void main(String[] args) {
		Node root = null;
		root = tree.create(root, 100);
		root  = tree.create(root, 50);
		root  = tree.create(root, 20);
		root  = tree.create(root, 70);
		root  = tree.create(root, 300);
		
		Node head = convert(root);
		print(head);
	}
	
	static Node prev = null;
	static Node convert(Node root) {
		if(root == null) return root;
		
		Node head  = convert(root.left);
		
		if(head == null) {
			head = root;
		}else {
			root.left = prev;
			prev.right =root;
		}
		prev = root;
		
		convert(root.right);
		
		return head;
	}
	
	static void print(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.right;
		}
	}

}
