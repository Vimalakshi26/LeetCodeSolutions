class Solution {
    public int maximumCount(int[] nums) {
        int lastNeg = lastNegative(nums);
        int firstPos = firstPositive(nums);

        int max = Math.max(lastNeg, firstPos);
        return max;
        
    }
    public int lastNegative(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] < 0){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(ans != -1){
            return ans+1;
        }else{
            return 0;
        }
    }

    public int firstPositive(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] > 0){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        if(ans != -1){
            return nums.length - ans;
        }else{
            return 0;
        }
    }
}