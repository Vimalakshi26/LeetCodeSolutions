class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        if(len == 1){
            return nums[0];
        }else if ( len == 2){
            if(nums[0] >= nums[1])
                return nums[0];
            else
                return nums[1];
        }else{
            for(int i = 0; i<len; i++){
                if (nums[i] == first || nums[i] == second || nums[i] == third) {
                    continue;
                }
                if(nums[i]>first){
                    third = second;
                    second = first;
                    first = nums[i];
                }else if(nums[i]>second){
                    third = second;
                    second = nums[i];
                }else if(nums[i]> third ){
                    third = nums[i];
                }
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int) first;
        }
        return (int) third;
    }
}