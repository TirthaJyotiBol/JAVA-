package gtree;
import java.util.*;
public class construction {

	public static void main(String[] args) {
		construction c = new construction();
		Node root = c.construct(null, 0);
		display(root);
	}
	
	class Node{
		int data;
		ArrayList<Node>children;
		Node(int data){
			this.data = data;
			children = new ArrayList<>();
		}
	}
	
	@SuppressWarnings("resource")
	Node construct(Node parent,int i) {
		Scanner scan = new Scanner(System.in);
		
		if(parent == null) {
			System.out.println("Enter the Root data");
		}
		else {
			System.out.println("Enter the child of "+parent.data);
		}
		
		int data = scan.nextInt();
		Node node = new Node(data);
		
		System.out.println("How many childrens does "+node.data+" have");
		int n = scan.nextInt();
		
		for(int j=0;i<n;i++) {
			Node child = construct(node,j);
			node.children.add(child);
		}
		
		return node;
	}
	
	static void display(Node root) {
		String str = root.data + " => ";
		for(Node x:root.children) {
			str+=x.data+" ";
		}
		System.out.println(" "+str+" ");
		
		for(Node x:root.children) {
			display(x);
		}
		
	}

}
