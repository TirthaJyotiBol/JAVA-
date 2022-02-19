// MCM based question
package dynamic_programming;
public class Palindrome_partition {

	public static void main(String[] args) {

		String str = "ababbbabbababa";
		
		int ans = palindromicPartition(str);
		System.out.println(ans);
	}
	
	 static int palindromicPartition(String str)
	    {
	        int s = 0;
	        int e = str.length()-1;
	        int[][]dp = new int[1000][1000];
	        
	        for(int i=0;i<dp.length;i++){
	            for(int j=0;j<dp[0].length;j++){
	                dp[i][j] = -1;
	            }
	        }
	        
	        return util(str,s,e,dp);
	    }
	    
	    static int util(String str,int i,int j,int dp[][]){
	        if(i>=j) return 0;
	        if(isPalindrome(str,i,j) == true) return 0;
	        
	        if(dp[i][j] != -1) return dp[i][j];
	        int min = Integer.MAX_VALUE;
	        
	        for(int k=i;k<j;k++){
	            int temp = util(str,i,k,dp) + util(str,k+1,j,dp) + 1;
	            if(temp < min){
	                min = temp;
	            }
	        }
	        return dp[i][j] = min;
	    }
	    
	    static boolean isPalindrome(String str,int i,int j){
	        if(str.length() == 0 ) return false;
	        
	        int s = i;
	        int e = j;
	        while(s<=e){
	            if(str.charAt(s) == str.charAt(e)){
	                s++;
	                e--;
	            }else{
	                return false;
	            }
	        }
	        return true;
	    }

}
