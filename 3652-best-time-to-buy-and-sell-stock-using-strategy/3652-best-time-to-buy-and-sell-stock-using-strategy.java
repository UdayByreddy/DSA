class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long profit = 0;
        int n= prices.length;
        long[] prefixSum = new long[n+1];
        for(int i=0;i<n;i++){
            profit += prices[i] * strategy[i];
            prefixSum[i+1] = (long)(prefixSum[i]+prices[i] * strategy[i]);
        }
        for(int i=0;i<=n-k;i++){
            long temp = prefixSum[i];
            for(int j=i+k/2;j<i+k;j++){
                temp+=prices[j];
            }
            temp+= prefixSum[n]-prefixSum[i+k];
            profit = Math.max(profit,temp);
        }
        return profit;
        
    }
}