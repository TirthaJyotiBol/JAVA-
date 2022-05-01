package Arrays;
import java.util.*;
public class SpiralTraversal {

	public static void main(String[] args) {
		int[][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		traverse(a);
	}
	
	
	static void traverse(int[][]a) {
		int min_row = 0;
		int max_row = a.length-1;
		int min_col = 0;
		int max_col = a[0].length-1;
		int dir = 0;
		
		ArrayList<Integer>ans = new ArrayList<>();
		int total = a.length * a[0].length;
		int cnt = 0;
		
		while(cnt < total) {
			if(dir == 0) {
				for(int i = min_row;i<=max_col;i++) {
					ans.add(a[min_row][i]);
					cnt++;
				}
				min_row++;
			}
			
			else if(dir == 1) {
				for(int i = min_row;i<=max_row;i++) {
					ans.add(a[i][max_col]);
					cnt++;
				}
				max_col -- ;
			}
			
			else if(dir == 2) {
				for(int i = max_col;i>=min_col;i--) {
					ans.add(a[max_row][i]);
					cnt++;
				}
				max_row--;
			}
			
			else if(dir == 3) {
				for(int i = max_row;i>=min_row;i--) {
					ans.add(a[i][min_col]);
					cnt++;
				}
				min_col++;
			}
			
			dir = (dir+1)%4;	// dir represents the direction i.e. at what side printing to be done 
			
		}
		
		
		System.out.println(ans);
	}

}
