/*
 uses a ArrayList of Lists to store value
 */

package graph;
import java.util.*;
public class Adjacency_List {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		int n = 3;
		
		for(int i=0;i<=n;i++) {
		adj.add(new ArrayList<Integer>());
		}
		
		// 1,2 =>
		adj.get(1).add(2);
		adj.get(2).add(1);
		
		// 1,3 =>
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		// 2,3 =>
		adj.get(2).add(3);
		adj.get(3).add(2);
		
		for(int i=0;i<adj.size();i++) {
			System.out.println(i+ " "+ adj.get(i));
		}

	}

}
