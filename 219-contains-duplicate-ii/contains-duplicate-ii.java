class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        if(nums.length == 1 || k <= 0){
            return false;
        }
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                int prev = hm.get(nums[i]);
                if(i - prev <= k){
                    return true;
                }
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}