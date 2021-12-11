package Recursion;
public class Last_Occurance {
	public static void main(String[] args) {
		int[]a = {1,9,3,2,3,1,5,2,7};
		int key = 2;
		int ans = lastOccurance(a,key,a.length);
		System.out.println(ans);
	}
	
	static int ans = -1;
	static int lastOccurance(int[]a,int key,int n) {
		if(n==0) return -1;
		
		
		lastOccurance(a,key,n-1);
		if(a[n-1] == key) ans = n-1;
		
		return ans;
	}

}
