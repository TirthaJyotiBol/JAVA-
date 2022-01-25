package gtree;
import gtree.Create.Node;
import java.util.*;
public class printPath {

	public static void main(String[] args) {

		Node root = gtree.Create.tree();
		ArrayList<Integer>ans = path(root,120);
		System.out.println(ans);
	}
	
	public static ArrayList<Integer> path(Node root,int ele){
		if(root.data == ele) {
			ArrayList<Integer>a = new ArrayList<>();
			a.add(root.data);
			return a;
		}
		else {
			for(Node x:root.childern) {
				ArrayList<Integer>adj = path(x,ele);
				if(adj.size()>0) {
					adj.add(root.data);
					return adj;
				}
			}
			
		}
		
		
		return new ArrayList<Integer>();
	}

}
