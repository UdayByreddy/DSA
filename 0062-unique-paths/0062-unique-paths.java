class Solution {
    // Unique Paths using dp
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
       for(int i=0;i<=m;i++){
        Arrays.fill(dp[i],-1);
       }
       return recur(m,n,dp);
    }
    public int recur(int m,int n,int[][] dp){
        if(m==1||n==1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        dp[m][n] = recur(m-1,n,dp)+recur(m,n-1,dp);
        return dp[m][n];
    }
}