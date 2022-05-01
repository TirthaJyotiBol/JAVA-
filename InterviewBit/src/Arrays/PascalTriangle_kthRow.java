package Arrays;
import java.util.*;
public class PascalTriangle_kthRow {

	public static void main(String[] args) {
		
		print(5);
	}
	
	static void print(int n) {
		ArrayList<Integer>ans = new ArrayList<>();
		int res = 1;
		for(int i=0;i<n;i++) {
			ans.add(res);
			res = res * (n-i);     // decrement numerator and multiply the previous
			res = res / (i+1);	  //  Increment denominator and multiply the previous
		}
		ans.add(1);
		System.out.println(ans);
	}

}
