package stack_and_queue;
public class RainWaterTrapped {

	public static void main(String[] args) {
		int[]a = {2,0,0,0,2};
		System.out.println(waterTrapped(a));
	}
	
	static int waterTrapped(int[]a) {
		if(a.length<=1) return 0;
		int[]pmax = new int[a.length];
		int[]nmax = new int[a.length];
		
		// Find the Previous max : 
		pmax[0] = a[0];
		for(int i=1;i<a.length;i++) {
			pmax[i] = Math.max(pmax[i-1], a[i]);
		}
		
		// Find the next max :
		nmax[a.length-1] = a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			nmax[i] = Math.max(a[i], nmax[i+1]);
		}
		
		int ans = 0;	
		
		// Maximum that is possible at that index - current element
		for(int i=0;i<a.length;i++) {
			ans+= Math.min(pmax[i], nmax[i]) - a[i];
		}
		
		return ans;
	}
	

}
