class Solution {
    // Next Permutation
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index1 = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index1=i;
                break;
            }
        }
        if(index1!=-1){
          for(int i=n-1;i>index1;i--){
            if(nums[i]>nums[index1]){
                swap(nums,i,index1);
                break;
            }
          } 
          
        }
        reverse(nums,index1+1,n-1); 

    }
    public void swap(int[] nums,int ind1,int ind2){
        int temp = nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2] = temp;
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
}