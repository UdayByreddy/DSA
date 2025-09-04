class Solution {
    public int reversePairs(int[] nums) {
        int ans = merge(0,nums.length-1,nums);
        return ans;
    }
    public int merge(int low,int high,int[] nums){
        int count =0;
        if(low>=high) return count;
        int mid = (low+high)/2;
        count+=merge(low,mid,nums);
        count+=merge(mid+1,high,nums);
        count+=reversePair(low,mid,high,nums);
        mergeSort(low,mid,high,nums);
        return count;
    }
    public int reversePair(int low,int mid,int high,int[] nums){
        int right = mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>2L*nums[right]){
                right++;
            }
            count+=(right - (mid+1));
        }
        return count;
    }
    public void mergeSort(int low,int mid,int high,int[] nums){
        int[] temp = new int[high-low+1];
        int left =low;
        int right = mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }
            else{
                temp[k++] = nums[right++];
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
            temp[k++] = nums[right++];
        }
        for(int i=0;i<temp.length;i++){
            nums[low+i]=temp[i];
        }
    }
}