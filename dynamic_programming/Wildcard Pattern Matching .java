package dynamic_programming;

public class Wildcard_pattern_matching {

	public static void main(String[] args) {

		String pattern = "ba*a?";
		String str = "baaabab";
		boolean ans = wildCard(pattern,str);
		System.out.println(ans);
	}
	
	static boolean wildCard(String pattern, String str)
    {
        boolean[][]dp = new boolean[pattern.length()+1][str.length()+1];
        dp[0][0] = true;
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0) dp[i][j] = true;
                else if(i==0) dp[i][j] = false;
                else if(j==0) {
                    if(pattern.charAt(i-1) == '*'){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = false;
                    }
                    
                }
            }
            
        }
        
        // similar to LCS => only get true or false here
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
               if(pattern.charAt(i-1) == '?' || pattern.charAt(i-1) == str.charAt(j-1)){
                  dp[i][j] = dp[i-1][j-1];
              }
              else if(pattern.charAt(i-1) == '*'){
                  dp[i][j] = dp[i][j-1] || dp[i-1][j];
              }
              else dp[i][j] = false;
            }
        }
        
        return dp[pattern.length()][str.length()];
    }
}
