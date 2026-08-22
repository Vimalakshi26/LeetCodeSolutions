class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(hm.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}