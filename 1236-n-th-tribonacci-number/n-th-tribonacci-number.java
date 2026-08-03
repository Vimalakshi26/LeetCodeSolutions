class Solution {
    public int tribonacci(int n) {
        if(n == 0)
            return 0; 
        else if(n == 1 && n == 2)
            return 1;
        int firstTerm = 0, secondTerm = 1, thirdTerm =1;
        for(int i=1; i<=n; i++)
        {
            int fourthTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm;
        }
        return firstTerm;
    }
}