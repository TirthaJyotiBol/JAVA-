package gtree;
import gtree.Create.Node;
import java.util.*;

public class Lowest_common_Ancesstor {

	public static void main(String[] args) {
		Node root = gtree.Create.tree();
		System.out.println(lca(root,120,10));
	}
	
	static int lca(Node root,int a,int b) {
		ArrayList<Integer>p1 = path(root,a);
		ArrayList<Integer>p2 = path(root,b);
		System.out.println(p1);
		System.out.println(p2);
		int i = p1.size()-1;
		int j = p2.size()-1;
		if(p1.size() == 0 || p2.size()==0) return -1;
		while(i>=0 && j>=0) {
				if(p1.get(i) == p2.get(j)) {
					i--;
					j--;
				}
				else {
					break;
				}
		}

		i++;
		j++;
		
		return p1.get(i);
	}
	
	static ArrayList<Integer> path(Node root,int e){
		if(root.data == e) {
			ArrayList<Integer>l = new ArrayList<>();
			l.add(root.data);
			return l;
		}
		
		else {
			
			for(Node x:root.childern) {
				ArrayList<Integer> a = path(x,e);
				if(a.size()>0) {
					a.add(root.data);
					return a;
				}
			}
			
		}
		
		return new ArrayList<Integer>();
	}

}
