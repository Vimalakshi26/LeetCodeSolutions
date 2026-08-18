class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        for(int i = 1; i < s.length(); i++){
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);
            if(prev == curr){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}