class Solution {
     private static final int MOD = 1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
       
        for(int[] query: queries){
            int start = query[0];
            int end = query[1];
            int inc = query[2];
            int mul = query[3];
            for(int i=start;i<=end;i+=inc){
                nums[i] = (int) (((long)nums[i]*mul)%MOD);
            }
        }
        int ans =0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}