class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n != 1){
            if(hs.contains(n)){
                return false;
            }
            hs.add(n);
            int sum = 0;
            int rem ;
         
            while(n>0){
                rem = n % 10;
                sum = sum + (rem * rem);
                n = n/10;
            }
            n = sum;
        }
        return true;
    }
}