package graph;
import java.util.*;
public class Adjacency_Map {

	public static void main(String[] args) {
		HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();
		
		for(int i=1;i<=4;i++) {
			map.put(i, new ArrayList<>());
		}

	// 1
		map.get(1).add(2);
		map.get(1).add(4);
		
		
	//2
		map.get(2).add(1);
		map.get(2).add(3);
		
	//3
		map.get(3).add(2);
		map.get(3).add(4);
		
	//4
		map.get(4).add(1);
		map.get(4).add(3);
		
    
		for(Map.Entry<Integer, ArrayList<Integer>>m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
