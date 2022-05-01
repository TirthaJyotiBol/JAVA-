package Arrays;
import java.util.*;
public class MatrixRotate {

	public static void main(String[] args) {
		int[][]a = {
				{1,2},
				{3,4},
		};
		
		ArrayList<ArrayList<Integer>>list = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			ArrayList<Integer>t = new ArrayList<>();
			for(int j=0;j<a.length;j++) {
				t.add(a[i][j]);
			}
			list.add(t);
		}
		
		System.out.println(list);
		rotate(list);
		
	}
	
	static void rotate(ArrayList<ArrayList<Integer>>list) {
		
		// 1. Transpose a matrix
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<=i;j++) {
				int temp1 = list.get(i).get(j);
				int temp2 = list.get(j).get(i);
				list.get(j).set(i, temp1);			// at [j][i] set [i][j]
				list.get(i).set(j, temp2);			// at [i][j] set [j][j]
			}
		}
		
		// 2. Reverse each row
		for(int i=0;i<list.size();i++) {
			int first = 0;
			int last = list.get(0).size()-1;
			while(last > first) {
				int temp1 = list.get(i).get(first);
				int temp2 = list.get(i).get(last);
				
				list.get(i).set(first, temp2);
				list.get(i).set(last, temp1);
				
				last--;
				first++;
			}
		}
		
		System.out.println(list);
	}

}
