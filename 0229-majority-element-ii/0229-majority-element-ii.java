class Solution {
    // using vooting algo 
    public List<Integer> majorityElement(int[] nums) {
        int can1 =Integer.MIN_VALUE;
        int count1 =0;
        int can2 =Integer.MIN_VALUE;
        int count2 =0;
        for(int num:nums){
            if(count1==0 && num!=can2){
                can1 = num;
                count1=1;
            }
           else if(count2==0 && num!=can1){
                can2 = num;
                count2=1;
            }
            else if(num==can1) count1++;
            else if(num==can2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==can1) count1++;
            if(num==can2) count2++;
        }
        int max = (int)(nums.length/3)+1;
        if(count1>=max) res.add(can1);
        if(count2>=max) res.add(can2);
        return res;
     
    }
}