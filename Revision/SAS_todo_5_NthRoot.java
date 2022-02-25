package Revision;

public class SAS_todo_5_NthRoot {

	public static void main(String[] args) {
		int num = 16;
		int n = 3;
		int ans = ans(num,n);
		System.out.println(ans);

	}
	
	static int ans(int num,int n) {
		
		int low = 1;
		int high = num;
		double eps = 1e-6;
		int ans = 0;
		
		while(high - low > eps) {
			int mid = (low + high )/2;
			
//			if(Math.pow(mid, n) == num ) {
//				return mid;
//			}
			
			if(Math.pow(mid, n) < num ) {
				low = mid ;
			}
			else {
				high = mid;
			}
			
				
		}
		
		System.out.println(low);
		
		return ans;
	}

}








/*class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[]ans = new int[2];
        
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                ans[0] = arr[i];
            }
            set.add(arr[i]);
        }
        
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                ans[1] = i;
                break;
            } 
        }
        
        
        return ans;
    }
}*/
