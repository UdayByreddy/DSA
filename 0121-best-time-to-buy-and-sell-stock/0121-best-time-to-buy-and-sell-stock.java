class Solution {
    // Best Time to Buy and Sell using dp
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int i=0;i<=prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return maxWithDp(0,0,prices,dp,1);
    }
    public int maxWithDp(int index,int buy,int[] prices,int[][] dp,int k){
       if (index == prices.length || k == 0) return 0;
        if(dp[index][buy]!=-1) return dp[index][buy];
        int maxProfit=0;
        if(buy==0){
            maxProfit = Math.max((-prices[index]+maxWithDp(index+1,1,prices,dp,k)),(maxWithDp(index+1,0,prices,dp,k)));
        }
        if(buy==1){
            maxProfit = Math.max((prices[index]+maxWithDp(index+1,0,prices,dp,k-1)),(maxWithDp(index+1,1,prices,dp,k)));
        }
        return dp[index][buy]=maxProfit;
    }
}