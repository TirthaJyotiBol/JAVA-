package gtree;
import gtree.Create.Node;
import java.util.*;

public class Level_order_traversal {

	public static void main(String[] args) {
		Node root =  gtree.Create.tree();
		LOT(root);
	}
	
	static void LOT(Node root) {
		Queue<Node>q = new LinkedList<>();
		q.add(root);
		
		while(q.size()>0) {
			root = q.poll();
			System.out.println(root.data);	
			
			for(Node child:root.childern) {
				q.add(child);
			}
			
		}
	}

}
