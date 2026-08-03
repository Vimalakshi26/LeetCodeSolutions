class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1, smax = -1, m = -1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                smax = max;
                max = nums[i];
                m = i;
            }
            else if(nums[i]>smax){
                smax = nums[i];
            }
        }
        if(smax*2 > max){
                return -1;
            }
            else{
                return m;
            }
    }
}