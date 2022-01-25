package gtree;
import java.util.*;
public class Create {
	public static void main(String[]arhs) {

		Node root = tree();
		display(root);
	}
	
	
	static Node tree(){
		Node root = null;
		int[]a = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		
		Stack<Node>stk = new Stack<>();
		for(int i=0;i<a.length;i++) {
			
// if value is -1 then pop elements
			if(a[i] == -1 && stk.size()>0)
			{
				stk.pop();
			}
			
// If value is not -1 then create a new node
			else {
				Node node = new Node();
				node.data = a[i];
				
				
// if there already exists element then make this as the child of top element of stack
				if(stk.size()>0) {	
					stk.peek().childern.add(node);
				}
// if size of stack == 0 then make this element as root
				else {
					root = node;
				}
				stk.push(node);
			}
		}
		return root;
	}
	
	static class Node{
		int data;
		ArrayList<Node>childern = new ArrayList<>();
	}
	
	static void display(Node root) {
		String str = root.data + "-> ";
		for(Node x:root.childern) {
			str+= x.data + ", ";
		}
		str+='.';
		System.out.println(str);
		
		
		for(Node child:root.childern) {
			display(child);
		}
		
	}

}
















