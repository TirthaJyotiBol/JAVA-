package dynamic_programming;

public class MCM_recursive {

	public static void main(String[] args) {
		int a[] = {40, 20, 30, 10, 30} ;
		int i = 1;
		int j = a.length;
		
		int ans = mcm(a,i,j-1);
		System.out.println(ans);
	}
	
	static int mcm(int[]a,int i,int j) {
		if(i>=j) return 0;
		
		int min = Integer.MAX_VALUE;
		for(int k=i; k<=j-1; k++) {
			int temp = mcm(a,i,k) + mcm(a,k+1,j) + (a[i-1]*a[k]*a[j]);
			if(temp < min) {
				min = temp;
			}
		}
		
		return min;
	}

}
