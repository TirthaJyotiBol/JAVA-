package dynamic_programming;

public class Check_subset_sum_SpaceOptimization {

	public static void main(String[] args) {
		int[]a = {2,3,7,8,10};
		int sum = 12;
		
		System.out.println(ssp_so(a,sum,a.length));
		
	}
	static boolean ssp_so(int[]a,int sum,int n) {
		boolean[][]tab = new boolean[n+1][sum+1];
		
		for(int i=0;i<tab.length;i++) {
			for(int j =0;j< tab[0].length;j++) {
				if(i == 0) tab[i][j] = false;
				if(j == 0) tab[i][j] = true;
			}
		}
		
		for(int i=1;i<tab.length;i++) {
			for(int j=1;j<tab[0].length;j++) {
				// donot include
				if(a[i-1] > j) {
					tab[i][j] = tab[i-1][j];
				}
				// either include or not
				else
				tab[i][j] = tab[i-1][j-a[i-1]] || tab[i-1][j];
			}
		}
		
		return tab[n][sum];
		
	}
	
}
