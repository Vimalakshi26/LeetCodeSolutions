class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startPtr = 0, endPtr = numbers.length -1;
        int[] ans = new int[2];
        while(startPtr<endPtr)
        {
            int sum = numbers[startPtr] + numbers[endPtr];
            if(sum == target){
                ans[0] = startPtr+1;
                ans[1] = endPtr+1;
                return ans;
            }
            else if(sum<target){
                startPtr++;
            }else{
                endPtr--;
            }
        }
        return ans;
    }
}
