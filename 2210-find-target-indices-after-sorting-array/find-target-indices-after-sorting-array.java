class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int len = nums.length;
        int smallNums = 0;
        int targetCount = 0;
        for(int i = 0; i<len; i++){
            if(nums[i]< target){
                smallNums++;
            }else if(nums[i] == target){
                targetCount++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        while(targetCount>0){
            ans.add(smallNums);
            smallNums++;
            targetCount--;
        }
        return ans;
    }
}