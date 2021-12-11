package Recursion;
public class First_Index {
	public static void main(String[] args) {
		int[]a = {2,5,11,2,67};
		int key = 2;
		int ans = firstIndex(a,key,a.length);
		System.out.println("Index : " +ans);
	}
	
	
	static int an = -1;
	static int firstIndex(int[]a,int key, int n) {
		if(n==0) return -1;	
		
		if(a[n-1]==key) an = n-1;
		firstIndex(a,key,n-1);
		
		
		return an;
	}

}
