class Solution {
    // Longest Consecutive Sequence using sorting
    public int longestConsecutive(int[] nums) {
         int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int smallEle = Integer.MIN_VALUE;
        int max =0;
        int count =1;
        for(int i=0;i<nums.length;i++){
          if(nums[i]-1==smallEle){
            count+=1;
            smallEle = nums[i];
          }
          else if(nums[i]!=smallEle){
            count=1;
            smallEle=nums[i];
          }
            max = Math.max(max,count);
        }
        return max;
    }
}