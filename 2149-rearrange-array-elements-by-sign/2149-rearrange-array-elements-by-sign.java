class Solution {
    // Rearragne array with sign
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int posIndex =0;
        int negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[posIndex] = nums[i];
                posIndex+=2;
            }
            else{
                res[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return res;

        
    }
}