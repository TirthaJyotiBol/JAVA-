package Revision;
public class Moore_voting_Algorithm {
	public static void main(String[] args) {
		
		int n = 5;
		int A[] = {3,1,3,3,2} ;
		
		int ans = moores(A,n);
		System.out.println(ans);

	}
	
	static int moores(int[]a,int size) {
		
		int ansIndex = 0;
		int count = 0;
		
		// get the element that is repeated the most times
		for(int i=1 ; i<size ;i++) {
			
			if(a[i] == a[ansIndex]) {
				count++;
			}
			else {
				count--;
			}
			if(count<=0) {
				count = 1;
				ansIndex = i;
			}
		}
		
		int freq = 0;
		for(int i=0;i<size;i++) {
			if(a[i] == a[ansIndex]) {
				freq++;
			}
		}
		
		if(freq> size/2 ) return a[ansIndex];
		
		return -1;
	}

}
