package Recursion;
public class Maximum_Element_in_array {
	public static void main(String[] args) {
		int[]a = {11,289,33,4,6};
		int v = maxm(a,a.length);
		System.out.println(v);
	}
	
	static int max = Integer.MIN_VALUE;
	static int maxm(int[]a,int n) {

		if(n==0) return -1;
		if(n==1) return a[0];
		
		if(a[n-1] > max) {
			max = n-1;
		}
		
		maxm(a,n-1);
		
		
		return max;
	}

}
